package com.akon.spring.consumer.integration.impl;

import com.akon.spring.consumer.domain.bean.UserInfoDo;
import com.akon.spring.consumer.domain.rpc.UserInfoFacadeService;
import com.akon.spring.consumer.integration.convert.UserInfoConvert;
import com.akon.spring.provider.facade.api.UserInfoFacade;
import com.akon.spring.provider.facade.dto.UserInfoDto;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserInfoFacadeServiceImpl implements UserInfoFacadeService {

    @Reference
    UserInfoFacade facade;

    @Override
    public List<UserInfoDo> getUserInfo() {
        return UserInfoConvert.INSTANCE.toDo(facade.getUserInfo());
    }

    @Override
    public int insert(UserInfoDo record) {
        UserInfoDto userInfoDto = null;
        try {
            userInfoDto = UserInfoConvert.INSTANCE.toDto(record);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int insert = facade.insert(userInfoDto);
        return insert;
    }


}
