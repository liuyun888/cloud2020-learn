package com.top.cloud.provider.hystrix.payment8006.controller;

import com.top.cloud.provider.hystrix.payment8006.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud2020-learn
 * @description:
 * @author: LiuYunKai
 * @create: 2020-04-30 11:34
 **/
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String servicePort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id") Integer id) {
        String result = paymentService.paymentInfo_Ok(id);
        log.info("=========result:" + result);
        return result;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id) {
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("=========result:" + result);
        return result;
    }
}
