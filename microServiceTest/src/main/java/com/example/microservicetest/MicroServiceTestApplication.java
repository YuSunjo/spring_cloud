package com.example.microservicetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServiceTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceTestApplication.class, args);
    }

}
