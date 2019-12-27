package com.bytedance.circularreference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * *****************************************************
 * Copyright (C) 2019 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 * ****************************************************
 *
 * @author liruikang<liruikang @ bytedance.com>
 * @date 12/23/2019
 **/
@Component
public class BeanA {
    /**
     * Autowireld ==> AutowiredAnnotationBeanPostProcessor
     * Resource ==> CommonAnnotationBeanPostProcessor
     */
    @Autowired
    private BeanB beanB;

    public BeanA(){
        System.out.println("BeanA...Constructor...");
    }

    @Async
    public void asyncMethod(){
        System.out.println(Thread.currentThread().getName()+" ==> BeanA...asyncMethod...");
    }
}
