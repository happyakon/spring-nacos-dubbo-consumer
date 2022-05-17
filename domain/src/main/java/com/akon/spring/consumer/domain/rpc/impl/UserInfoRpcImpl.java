package com.akon.spring.consumer.domain.rpc.impl;

import com.akon.spring.consumer.domain.bean.UserInfoDO;
import com.akon.spring.consumer.domain.rpc.UserInfoRpc;
import com.akon.spring.provider.facade.api.UserInfoFacade;
import com.akon.spring.provider.facade.dto.UserInfo;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class UserInfoRpcImpl implements UserInfoRpc {

    @Reference
    UserInfoFacade facade;

    @Override
    public UserInfoDO getUserInfo() {
        UserInfo userInfo = facade.getUserInfo();
        UserInfoDO userInfoDO=new UserInfoDO();
        userInfoDO.setAge(userInfo.getAge());
        userInfoDO.setUserName(userInfo.getUserName());
        return userInfoDO;
    }
}
