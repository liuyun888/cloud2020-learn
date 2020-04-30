package com.top.cloud.consumer.hystrix.order80.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: cloud2020-learn
 * @description:
 * @author: LiuYunKai
 * @create: 2020-04-30 12:09
 **/
@Component
@FeignClient(value = "consul-provider-hystrix-payment",fallback = PaymentFallBackService.class)
public interface PaymentHystrixService {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id);
}
