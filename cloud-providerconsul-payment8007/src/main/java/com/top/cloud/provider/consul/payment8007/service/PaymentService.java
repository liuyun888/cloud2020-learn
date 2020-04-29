package com.top.cloud.provider.consul.payment8007.service;

import com.top.cloud.api.common.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020-learn
 * @description:
 * @author: LiuYunKai
 * @create: 2020-04-27 23:50
 **/
public interface PaymentService
{
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
