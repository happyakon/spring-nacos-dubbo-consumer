package com.akon.spring.consumer.facade.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 9112086906391590589L;

    private String userName;
    private Integer age;
}
