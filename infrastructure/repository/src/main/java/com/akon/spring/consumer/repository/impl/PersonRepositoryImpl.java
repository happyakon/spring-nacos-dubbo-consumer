package com.akon.spring.consumer.repository.impl;

import com.akon.spring.consumer.domain.bean.PersonDo;
import com.akon.spring.consumer.domain.repository.PersonRepository;
import com.akon.spring.consumer.repository.convert.PersonConvert;
import com.akon.spring.consumer.repository.dao.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonRepositoryImpl implements PersonRepository {

    @Resource
    PersonMapper personMapper;

    @Override
    public int insert(PersonDo record) {
        return personMapper.insert(PersonConvert.INSTANCE.toPo(record));
    }

    @Override
    public int insertSelective(PersonDo record) {
        return personMapper.insertSelective(PersonConvert.INSTANCE.toPo(record));
    }

    @Override
    public PersonDo selectByPrimaryKey(Integer id) {
        return PersonConvert.INSTANCE.toDo(personMapper.selectByPrimaryKey(id));
    }

    @Override
    public int updateByPrimaryKeySelective(PersonDo record) {
        return personMapper.updateByPrimaryKeySelective(PersonConvert.INSTANCE.toPo(record));
    }

    @Override
    public int updateByPrimaryKey(PersonDo record) {
        return personMapper.updateByPrimaryKey(PersonConvert.INSTANCE.toPo(record));
    }
}
