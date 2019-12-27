package com.bytedance.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bytedance.bean.Boss;
import com.bytedance.bean.Car;
import com.bytedance.bean.Color;
import com.bytedance.bean.Red;
import com.bytedance.config.MainConifgOfAutowired;
import com.bytedance.dao.BookDao;
import com.bytedance.service.BookService;

public class IOCTest_Autowired {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);
		
		BookService bookService = applicationContext.getBean(BookService.class);
		System.out.println(bookService);

		BookDao bean = applicationContext.getBean(BookDao.class);
		System.out.println(bean);

		Boss boss = applicationContext.getBean(Boss.class);
		System.out.println(boss);
		Car car = applicationContext.getBean(Car.class);
		System.out.println(car);

		Color color = applicationContext.getBean(Color.class);
		System.out.println(color);
		System.out.println(applicationContext);
		applicationContext.close();
	}

}
