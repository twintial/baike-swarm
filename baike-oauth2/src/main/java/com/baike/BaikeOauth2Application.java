package com.baike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BaikeOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(BaikeOauth2Application.class,args);
    }
}
