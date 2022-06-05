package com.akon.spring.consumer.service.convert;

import com.akon.spring.consumer.domain.bean.PersonDo;
import com.akon.spring.consumer.facade.dto.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonConvert {

    PersonConvert INSTANCE= Mappers.getMapper(PersonConvert.class);

    PersonDo toDo(PersonDTO personDTO);
}
