package com.example.zuul_second_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SecondServiceController {

    @GetMapping("/welcome")
    public String second() {
        return "welcome second service";

    }
}
