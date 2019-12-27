package com.bytedance.circularreference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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
public class BeanB {

    @Autowired
    @Lazy
    private BeanA beanA;

    public BeanB(){
        System.out.println("BeanB...Constructor...");
    }
//    @Async
    public void asyncMethod(){
        // AsyncAnnotationBeanPostProcessor
        System.out.println("BeanB...asyncMethod...");
    }
    public BeanA getBeanA(){
        return beanA;
    }
}
