package com.top.cloud.consumer.hystrix.order80.service;

import org.springframework.stereotype.Component;

/**
 * @program: cloud2020-learn
 * @description:
 * @author: LiuYunKai
 * @create: 2020-04-30 12:11
 **/
@Component
public class PaymentFallBackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "===PaymentFallBackService  paymentInfo_Ok, 失败";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "===PaymentFallBackService  paymentInfo_Timeout, 失败";
    }
}
