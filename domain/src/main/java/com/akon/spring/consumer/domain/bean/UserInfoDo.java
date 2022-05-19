package com.akon.spring.consumer.domain.bean;

import lombok.Data;


@Data
public class UserInfoDo {
    private Integer userId;

    private String userName;

    private Integer userAge;

    private Long userScore;

    private Double userSalary;

    private String userSex;

    private String createTime;

    private String updateTime;
}
