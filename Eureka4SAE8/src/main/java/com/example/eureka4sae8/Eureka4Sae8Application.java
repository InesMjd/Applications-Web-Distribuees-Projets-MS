package com.example.eureka4sae8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka4Sae8Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka4Sae8Application.class, args);
    }

}
