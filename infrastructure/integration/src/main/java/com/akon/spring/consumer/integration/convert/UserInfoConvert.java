package com.akon.spring.consumer.integration.convert;

import com.akon.spring.consumer.domain.bean.UserInfoDo;
import com.akon.spring.provider.facade.dto.UserInfoDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserInfoConvert {
    UserInfoConvert INSTANCE= Mappers.getMapper(UserInfoConvert.class);

    List<UserInfoDo> toDo(List<UserInfoDto> records);

    UserInfoDto toDto(UserInfoDo record);
}
