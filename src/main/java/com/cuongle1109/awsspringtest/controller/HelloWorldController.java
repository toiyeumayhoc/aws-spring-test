package com.cuongle1109.awsspringtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String helloFromAWS(){
        return "Hello from AWS";
    }
}
