package com.spring.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
public class Hello {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }

}
