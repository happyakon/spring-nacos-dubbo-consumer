package com.akon.spring.consumer.service.api.impl;

import com.akon.spring.consumer.domain.repository.PersonRepository;
import com.akon.spring.consumer.domain.rpc.UserInfoFacadeService;
import com.akon.spring.consumer.facade.dto.PersonDTO;
import com.akon.spring.consumer.facade.dto.UserInfoDto;
import com.akon.spring.consumer.service.api.PersonService;
import com.akon.spring.consumer.service.convert.PersonConvert;
import com.akon.spring.consumer.service.convert.UserInfoConvert;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;


@Service
public class PersonServiceImpl implements PersonService {

    @Resource
    UserInfoFacadeService userInfoFacadeService;

    @Autowired
    PersonRepository repository;

    @GlobalTransactional(name="add-person",rollbackFor = Exception.class)
    @Override
    public String addPerson(PersonDTO request) {
        int insert = repository.insert(PersonConvert.INSTANCE.toDo(request));
        UserInfoDto userInfoDto=new UserInfoDto();
        userInfoDto.setUserName("陈彬");
        userInfoDto.setUserAge(33);
        userInfoDto.setUserSalary(new BigDecimal(29000));
        int insert1 = userInfoFacadeService.insert(UserInfoConvert.INSTANCE.toDo(userInfoDto));
        if(insert>0&&insert1>0){
            return "success";
        }
        return "fail";
    }
}
