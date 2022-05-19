package com.akon.spring.consumer.service.api.impl;

import com.akon.spring.consumer.domain.bean.UserInfoDo;
import com.akon.spring.consumer.domain.rpc.UserInfoFacadeService;
import com.akon.spring.consumer.service.api.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    UserInfoFacadeService userInfoFacadeService;

    @Override
    public List<UserInfoDo> getUserInfo() {
        return userInfoFacadeService.getUserInfo();
    }
}
