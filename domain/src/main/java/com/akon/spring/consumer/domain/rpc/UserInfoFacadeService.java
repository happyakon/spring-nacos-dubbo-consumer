package com.akon.spring.consumer.domain.rpc;

import com.akon.spring.consumer.domain.bean.UserInfoDo;

import java.util.List;

public interface UserInfoFacadeService {

    List<UserInfoDo> getUserInfo();
}
