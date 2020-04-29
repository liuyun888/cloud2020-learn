package com.top.cloud.provider.consul.payment8006.service.impl;

import com.top.cloud.api.common.entities.Payment;
import com.top.cloud.provider.consul.payment8006.dao.PaymentDao;
import com.top.cloud.provider.consul.payment8006.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2020-learn
 * @description:
 * @author: LiuYunKai
 * @create: 2020-04-27 23:50
 **/
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }
    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
