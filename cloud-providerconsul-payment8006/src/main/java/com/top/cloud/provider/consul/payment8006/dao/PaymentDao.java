package com.top.cloud.provider.consul.payment8006.dao;

import com.top.cloud.api.common.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020-learn
 * @description: 接口PaymentDao
 * @author: LiuYunKai
 * @create: 2020-04-27 23:50
 **/
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
