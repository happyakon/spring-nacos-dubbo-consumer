package com.akon.spring.consumer.service.api;

import com.akon.spring.consumer.domain.bean.UserInfoDo;

import java.util.List;

public interface UserInfoService {
    List<UserInfoDo> getUserInfo();
}
