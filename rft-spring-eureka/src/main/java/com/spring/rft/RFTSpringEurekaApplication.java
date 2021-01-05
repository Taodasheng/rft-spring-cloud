package com.spring.rft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RFTSpringEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(RFTSpringEurekaApplication.class);
    }
}
