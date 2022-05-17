package com.akon.spring.consumer.service.impl;

import com.akon.spring.consumer.facade.api.UserInfoFacade;
import com.akon.spring.consumer.facade.dto.UserInfo;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;


@Service
public class UserInfoFacadeImpl implements UserInfoFacade {

    @Reference
    com.akon.spring.provider.facade.api.UserInfoFacade facade;

    @Override
    public UserInfo getUserInfo() {
        com.akon.spring.provider.facade.dto.UserInfo userInfo = facade.getUserInfo();
        UserInfo userInfoDTO=new UserInfo();
        userInfoDTO.setUserName(userInfo.getUserName());
        userInfoDTO.setAge(userInfo.getAge());
        return userInfoDTO;
    }
}
