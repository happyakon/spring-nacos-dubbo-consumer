package com.akon.spring.consumer.domain.bean;

import lombok.Data;

import java.util.Date;

@Data
public class PersonDo {
    private Integer id;

    private String name;

    private String job;

    private Date createDate;

    private Date updateDate;
}
