package com.jpractice.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("")
    public String hello(){
        return "hello!!! 와 진짜 배포 되는거임?";
    }
}
