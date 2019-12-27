package com.bytedance.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.bytedance.bean.RainBow;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	/**
	 * AnnotationMetadata����ǰ���ע����Ϣ
	 * BeanDefinitionRegistry:BeanDefinitionע���ࣻ
	 * 		��������Ҫ��ӵ������е�bean������
	 * 		BeanDefinitionRegistry.registerBeanDefinition�ֹ�ע�����
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		
		boolean definition = registry.containsBeanDefinition("com.bytedance.bean.Red");
		boolean definition2 = registry.containsBeanDefinition("com.bytedance.bean.Blue");
		if(definition && definition2){
			//ָ��Bean������Ϣ����Bean�����ͣ�Bean��������
			RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
			//ע��һ��Bean��ָ��bean��
			registry.registerBeanDefinition("rainBow", beanDefinition);
		}
	}

}
