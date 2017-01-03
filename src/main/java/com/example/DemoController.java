package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello spring at " + new Date(System.currentTimeMillis());
    }
}
