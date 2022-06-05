package com.akon.spring.consumer.facade.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PersonDTO {

    private Integer id;

    private String name;

    private String job;

    private Date createDate;

    private Date updateDate;
}
