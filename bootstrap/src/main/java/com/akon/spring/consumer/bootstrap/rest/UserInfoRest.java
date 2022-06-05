package com.akon.spring.consumer.bootstrap.rest;

import com.akon.spring.consumer.domain.bean.UserInfoDo;
import com.akon.spring.consumer.facade.dto.PersonDTO;
import com.akon.spring.consumer.service.api.PersonService;
import com.akon.spring.consumer.service.api.UserInfoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoRest {

    @Resource
    UserInfoService service;

    @Resource
    PersonService personService;

    @RequestMapping("/getUser")
    public List<UserInfoDo> getUserInfo(){
        return service.getUserInfo();
    }
    @RequestMapping("/addPerson")
    public String addPerson(@RequestBody PersonDTO request){
       return personService.addPerson(request);
    }
}
