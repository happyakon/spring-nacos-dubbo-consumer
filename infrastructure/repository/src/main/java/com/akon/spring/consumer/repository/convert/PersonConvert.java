package com.akon.spring.consumer.repository.convert;

import com.akon.spring.consumer.domain.bean.PersonDo;
import com.akon.spring.consumer.repository.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PersonConvert {
    PersonConvert INSTANCE= Mappers.getMapper(PersonConvert.class);

    Person toPo(PersonDo record);

    List<Person> toPO(List<PersonDo> records);

    PersonDo toDo(Person record);

    List<PersonDo> toDo(List<Person> records);
}
