package com.akon.spring.consumer.bootstrap.rest;

import com.akon.spring.consumer.domain.bean.UserInfoDo;
import com.akon.spring.consumer.service.api.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoRest {

    @Resource
    UserInfoService service;

    @RequestMapping("/getUser")
    public List<UserInfoDo> getUserInfo(){
        return service.getUserInfo();
    }
}
