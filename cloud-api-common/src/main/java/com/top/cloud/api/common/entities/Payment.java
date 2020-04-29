package com.top.cloud.api.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: cloud2020-learn
 * @description: 测试
 * @author: LiuYunKai
 * @create: 2020-04-27 23:46
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String name;
}
