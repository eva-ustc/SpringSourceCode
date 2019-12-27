package com.bytedance.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
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
 * @date 12/20/2019
 **/
//@Component
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        System.out.println("MyMergedBeanDefinitionPostProcessor...postProcessMergedBeanDefinition...beanName ==> "+beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyMergedBeanDefinitionPostProcessor...postProcess'Before'Initialization...beanName ==> "+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyMergedBeanDefinitionPostProcessor...postProcess'After'Initialization...beanName ==> "+beanName);
        return bean;
    }
}
