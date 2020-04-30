package com.top.cloud.provider.hystrix.payment8006;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class CloudProviderHystrixPayment8006Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderHystrixPayment8006Application.class, args);
    }

}
