package com.etc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.etc.dao")
@EnableTransactionManagement
public class ElemeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElemeApplication.class, args);
    }
}
