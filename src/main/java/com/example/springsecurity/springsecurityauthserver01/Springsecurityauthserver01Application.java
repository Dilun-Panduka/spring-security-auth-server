package com.example.springsecurity.springsecurityauthserver01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springsecurity.springsecurityauthserver01.config"})
public class Springsecurityauthserver01Application {

    public static void main(String[] args) {
        SpringApplication.run(Springsecurityauthserver01Application.class, args);
    }

}
