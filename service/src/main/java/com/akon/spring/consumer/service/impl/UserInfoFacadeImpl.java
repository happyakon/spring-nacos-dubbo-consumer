package com.akon.spring.consumer.service.impl;

import com.akon.spring.consumer.domain.bean.UserInfoDO;
import com.akon.spring.consumer.domain.rpc.UserInfoRpc;
import com.akon.spring.consumer.facade.api.UserInfoFacade;
import com.akon.spring.consumer.facade.dto.UserInfoDto;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;


@Service
public class UserInfoFacadeImpl implements UserInfoFacade {

    @Resource
    UserInfoRpc userInfoRpc;

    @Override
    public UserInfoDto getUserInfo() {
        UserInfoDO userInfo = userInfoRpc.getUserInfo();
        UserInfoDto userInfoDTO=new UserInfoDto();
        userInfoDTO.setUserName(userInfo.getUserName());
        userInfoDTO.setAge(userInfo.getAge());
        return userInfoDTO;
    }
}
