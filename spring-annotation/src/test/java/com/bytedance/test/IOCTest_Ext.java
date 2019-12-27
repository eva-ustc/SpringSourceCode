package com.bytedance.test;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bytedance.aop.MathCalculator;
import com.bytedance.bean.Boss;
import com.bytedance.bean.Car;
import com.bytedance.bean.Color;
import com.bytedance.bean.Red;
import com.bytedance.config.MainConfigOfAOP;
import com.bytedance.config.MainConifgOfAutowired;
import com.bytedance.dao.BookDao;
import com.bytedance.ext.ExtConfig;
import com.bytedance.service.BookService;

public class IOCTest_Ext {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);
		
		
		//发布事件；
		applicationContext.publishEvent(new ApplicationEvent(new String("我发布的事件")) {
		});
		
		applicationContext.close();
	}

}
