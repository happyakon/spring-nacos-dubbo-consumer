package com.akon.spring.consumer.repository.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Person {
    private Integer id;

    private String name;

    private String job;

    private Date createDate;

    private Date updateDate;
}