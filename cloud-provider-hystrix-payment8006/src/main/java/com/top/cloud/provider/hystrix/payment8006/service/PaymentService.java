package com.top.cloud.provider.hystrix.payment8006.service;

import java.util.concurrent.TimeUnit;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * @program: cloud2020-learn
 * @description:
 * @author: LiuYunKai
 * @create: 2020-04-30 11:29
 **/
@Service
public class PaymentService {

    /**
     * 正常访问
     *
     * @param id
     * @return
     */
    public String paymentInfo_Ok(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_Ok,id:" + id;
    }

    @HystrixCommand(
            fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
    }
    )
    public String paymentInfo_TimeOut(Integer id) {

        int timeNum = 3;
        try {
            //暂停3秒
            TimeUnit.SECONDS.sleep(timeNum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_TimeOut,id:" + id;
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_TimeOut繁忙，稍后再试====,id:" + id;
    }

}
