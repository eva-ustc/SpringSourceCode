package com.bytedance.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Cat implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware {

	private ApplicationContext applicationContext;
	private String beanName;

    public Cat() {
        System.out.println("cat...constructor...");
		System.out.println("constructor...beanName ==> "+beanName);
		System.out.println("constructor...applicationContext ==> " +applicationContext);
    }


    @Override
    public void afterPropertiesSet() {
        System.out.println("cat...InitializingBean...afterPropertiesSet...");
		System.out.println("InitializingBean...afterPropertiesSet...beanName ==> "+beanName);
		System.out.println("InitializingBean...afterPropertiesSet...applicationContext ==> " +applicationContext);
    }
    @Override
    public void destroy() {
        System.out.println("cat...DisposableBean...destroy...");
		System.out.println("DisposableBean...destroy...beanName ==> "+beanName);
		System.out.println("DisposableBean...destroy...applicationContext ==> " +applicationContext);
    }


    @PostConstruct
    public void postConstruct() {
        System.out.println("cat...@PostConstruct...postConstruct...");
		System.out.println("@PostConstruct...postConstruct...beanName ==> "+beanName);
		System.out.println("@PostConstruct...postConstruct...applicationContext ==> " +applicationContext);
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("cat...@PreDestroy...preDestroy...");
		System.out.println("@PreDestroy...preDestroy...beanName ==> "+beanName);
		System.out.println("@PreDestroy...preDestroy...applicationContext ==> " +applicationContext);
    }

    @Async
    public void run() {
        System.out.println("cat...async...run");
    }

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
