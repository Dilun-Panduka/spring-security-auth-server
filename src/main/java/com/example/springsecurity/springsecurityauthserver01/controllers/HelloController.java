package com.example.springsecurity.springsecurityauthserver01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helo")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }
}
