package com.akon.spring.consumer.bootstrap;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.akon.spring.consumer"})
@DubboComponentScan(basePackages = {"com.akon.spring.consumer"})
@MapperScan(basePackages = {"com.akon.spring.consumer.repository"})
public class BootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapApplication.class, args);
    }

}
