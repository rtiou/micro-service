package com.tiou.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableEurekaServer
public class ServiceDiscoveryServerApplication{
    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryServerApplication.class);
    }
}