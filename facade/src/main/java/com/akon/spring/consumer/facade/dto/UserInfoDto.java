package com.akon.spring.consumer.facade.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class UserInfoDto implements Serializable {
    private static final long serialVersionUID = 9112086906391590589L;

    private Integer userId;

    private String userName;

    private Integer userAge;

    private Long userScore;

    private BigDecimal userSalary;

    private String userSex;

    private String createTime;

    private String updateTime;
}
