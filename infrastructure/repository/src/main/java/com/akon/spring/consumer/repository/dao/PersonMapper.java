package com.akon.spring.consumer.repository.dao;

import com.akon.spring.consumer.repository.entity.Person;

public interface PersonMapper {
    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}