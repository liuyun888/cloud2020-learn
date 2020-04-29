package com.top.cloud.provider.consul.payment8007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderconsulPayment8007Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderconsulPayment8007Application.class, args);
    }

}
