package com.bytedance.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Cat implements InitializingBean,DisposableBean {
	
	public Cat(){
		System.out.println("cat constructor...");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("cat...DisposableBean...destroy...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("cat...InitializingBean...afterPropertiesSet...");
	}
	@PostConstruct
	public void init(){
		System.out.println("cat...@PostConstruct...init");
	}
	@PreDestroy
	public void preDestroy(){
		System.out.println("cat...@PreDestroy...preDestroy");
	}

}
