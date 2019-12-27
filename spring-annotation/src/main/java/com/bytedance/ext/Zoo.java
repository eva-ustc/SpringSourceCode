package com.bytedance.ext;

import com.bytedance.lifecycle.Cat;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//默认加在ioc容器中的组件，容器启动会调用无参构造器创建对象，再进行初始化赋值等操作
//@Component
public class Zoo implements InitializingBean, DisposableBean {
	
	private Cat cat;
	@Autowired
	//构造器要用的组件，都是从容器中获取
	public Zoo(Cat cat){
		this.cat = cat;
		System.out.println("Zoo...有参构造器");
	}
	public Zoo(){
		System.out.println("Zoo...无参构造器");
	}

	public Cat getCat() {
		return cat;
	}


	//TODO
//	@Autowired
	//标注在方法，Spring容器创建当前对象，就会调用方法，完成赋值；
	//方法使用的参数，自定义类型的值从ioc容器中获取
	public void setCat(Cat cat) {
		this.cat = cat;
		System.out.println("zoo...setCat...");
	}
	@PostConstruct
	public void init(){
		System.out.println("zoo...@PostConstruct...init");
	}
	@PreDestroy
	public void preDestroy(){
		System.out.println("zoo...@PreDestroy...preDestroy");
	}

	@Override
	public String toString() {
		return "Zoo [cat=" + cat + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("zoo...DisposableBean...destroy...");

	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("zoo...InitializingBean...afterPropertiesSet...");

	}
}
