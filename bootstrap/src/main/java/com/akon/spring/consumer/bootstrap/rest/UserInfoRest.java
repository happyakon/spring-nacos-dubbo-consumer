package com.akon.spring.consumer.bootstrap.rest;

import com.akon.spring.consumer.facade.api.UserInfoFacade;
import com.akon.spring.consumer.facade.dto.UserInfoDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserInfoRest {

    @Resource
    UserInfoFacade userInfoFacade;

    @RequestMapping("/getUser")
    public UserInfoDto getUserInfo(){
        return userInfoFacade.getUserInfo();
    }
}
