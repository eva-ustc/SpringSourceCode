package com.bytedance.test;

import com.bytedance.lifecycle.Cat;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bytedance.config.MainConfigOfLifeCycle;

public class IOCTest_LifeCycle {
	
	@Test
	public void test01(){
		//1、创建ioc容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
		System.out.println("=====================> 容器创建完成...");

		Cat cat = (Cat)applicationContext.getBean("cat");
		System.out.println(cat);
		//关闭容器
		applicationContext.close();
	}
}
