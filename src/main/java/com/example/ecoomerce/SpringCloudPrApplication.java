package com.example.ecoomerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudPrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPrApplication.class, args);
    }

}
