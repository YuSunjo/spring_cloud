package com.example.zuul_first.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// http://localhost:8081/welcome - zuul Service에서는 이렇게 받음
// http://localhost:8081/first-service/welcome - gateway에서는 이렇게 받음
@RestController
@RequestMapping("/first-service")
@Slf4j
public class FirstServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome to first service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader(value = "first-request") String header) {
        log.info(header);
        return "hello";
    }

    @GetMapping("/check")
    public String check() {
        return "hi first service";
    }

}
