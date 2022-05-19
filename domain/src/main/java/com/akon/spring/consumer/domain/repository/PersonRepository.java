package com.akon.spring.consumer.domain.repository;

import com.akon.spring.consumer.domain.bean.PersonDo;

public interface PersonRepository {

    int insert(PersonDo record);

    int insertSelective(PersonDo record);

    PersonDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PersonDo record);

    int updateByPrimaryKey(PersonDo record);
}
