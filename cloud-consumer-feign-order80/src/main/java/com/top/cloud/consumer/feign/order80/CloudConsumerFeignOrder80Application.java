package com.top.cloud.consumer.feign.order80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
@EnableFeignClients
public class CloudConsumerFeignOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignOrder80Application.class, args);
    }

}
