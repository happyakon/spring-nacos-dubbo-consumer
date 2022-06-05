package com.akon.spring.consumer.service.convert;

import com.akon.spring.consumer.domain.bean.UserInfoDo;
import com.akon.spring.consumer.facade.dto.UserInfoDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserInfoConvert {

    UserInfoConvert INSTANCE= Mappers.getMapper(UserInfoConvert.class);

    UserInfoDo toDo(UserInfoDto record);
}
