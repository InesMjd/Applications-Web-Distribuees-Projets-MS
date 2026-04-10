package com.example.eureka4twin4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka4Twin4Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka4Twin4Application.class, args);
    }

}
