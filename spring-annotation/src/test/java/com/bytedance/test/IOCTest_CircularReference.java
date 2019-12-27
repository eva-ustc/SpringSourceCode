package com.bytedance.test;

import com.bytedance.circularreference.BeanA;
import com.bytedance.circularreference.BeanB;
import com.bytedance.config.MainConfigOfCircularReference;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;

/**
 * *****************************************************
 * Copyright (C) 2019 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 * ****************************************************
 * <p>
 * 循环依赖
 *
 * @author liruikang<liruikang @ bytedance.com>
 * @date 12/23/2019
 **/
public class IOCTest_CircularReference {

    @Test
    public void test01() throws InterruptedException {
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfCircularReference.class);
        /*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(MainConfigOfCircularReference.class);
        applicationContext.refresh();*/
        System.out.println("=====================> 容器创建完成...");

        BeanA beanA = (BeanA) applicationContext.getBean("beanA");
        BeanB beanB = (BeanB) applicationContext.getBean("beanB");
        System.out.println("beanA == beanB.beanA? "+Objects.equals(beanA,beanB.getBeanA()));
        beanA.asyncMethod();
        beanB.getBeanA().asyncMethod();
        //关闭容器
        applicationContext.close();
    }
}
