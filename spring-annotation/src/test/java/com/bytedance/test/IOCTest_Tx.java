package com.bytedance.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bytedance.aop.MathCalculator;
import com.bytedance.bean.Boss;
import com.bytedance.bean.Car;
import com.bytedance.bean.Color;
import com.bytedance.bean.Red;
import com.bytedance.config.MainConfigOfAOP;
import com.bytedance.config.MainConifgOfAutowired;
import com.bytedance.dao.BookDao;
import com.bytedance.service.BookService;
import com.bytedance.tx.TxConfig;
import com.bytedance.tx.UserService;

public class IOCTest_Tx {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(TxConfig.class);

        UserService userService = applicationContext.getBean(UserService.class);

        userService.insertUser();
        applicationContext.close();
    }
}
