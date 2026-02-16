package com.example.apigateway4sae1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGateway4Sae1Application {

    public static void main(String[] args) {
        SpringApplication.run(ApiGateway4Sae1Application.class, args);
    }


    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route("C",r->r.path("/candidats/**")
                        .uri("lb://CANDIDAT4SAE2") )


                .route("Job", r->r.path("/jobs/**")
                        .uri("lb://JOB") )
                .build();
    }

}
