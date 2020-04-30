package com.top.cloud.consumer.hystrix.order80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class CloudConsumerHystrixOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerHystrixOrder80Application.class, args);
    }

}
