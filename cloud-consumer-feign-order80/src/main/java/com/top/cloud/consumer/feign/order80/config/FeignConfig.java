package com.top.cloud.consumer.feign.order80.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2020-learn
 * @description:
 * @author: LiuYunKai
 * @create: 2020-04-29 15:58
 **/
@Configuration
public class FeignConfig
{
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}
