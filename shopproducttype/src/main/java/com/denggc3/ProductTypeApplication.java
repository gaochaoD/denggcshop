package com.denggc3;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author denggc3
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProductTypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductTypeApplication.class, args);
    }
}
