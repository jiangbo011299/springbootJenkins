package com.jiangbo.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world ....111222333444555666";
    }
}
