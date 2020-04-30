package com.top.cloud.consumer.hystrix.order80.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.top.cloud.consumer.hystrix.order80.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud2020-learn
 * @description: 消费端Hystrix
 * @author: LiuYunKai
 * @create: 2020-04-30 12:15
 **/
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallBackMethod")
public class OrderHystrixController {
    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @HystrixCommand
    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id") Integer id) {
        int i = 10 / 0;
        String result = paymentHystrixService.paymentInfo_Ok(id);
        return result;
    }

    @HystrixCommand(fallbackMethod = "paymentTimeoutFallBackMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1")
    })
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfo_Timeout(id);
        return result;
    }

    /**
     * 单独的异常处理
     *
     * @return
     */
    public String paymentTimeoutFallBackMethod(@PathVariable("id") Integer id) {
        return "paymentInfo_Timeout 特有的异常处理信息";
    }


    public String payment_Global_FallBackMethod() {
        return "全局异常处理信息，请稍后【【】【】【";
    }


}
