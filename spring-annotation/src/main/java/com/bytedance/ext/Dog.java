package com.bytedance.ext;

import com.bytedance.lifecycle.Cat;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements ApplicationContextAware {
	
	//@Autowired
	private ApplicationContext applicationContext;
	@Autowired
	private Cat cat;
	
	public Dog(){
		System.out.println("Dog constructor...");
	}
	
	//对象创建并赋值之后调用
	@PostConstruct
	public void init(){
		System.out.println("Dog....@PostConstruct...");
	}
	
	//容器移除对象之前
	@PreDestroy
	public void destroy(){
		System.out.println("Dog....@PreDestroy...");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("dog...setApplicationContext");
		this.applicationContext = applicationContext;
	}
	

}
