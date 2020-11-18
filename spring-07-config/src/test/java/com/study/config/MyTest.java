package com.study.config;

import com.study.config.config.MyConfig;
import com.study.config.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzz
 * @create 2020-11-15 22:58
 **/

public class MyTest {

    @Test
    public void test() {
        //获取配置类的ApplicationContext,
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user);
        System.out.println(user2);
        System.out.println(user == user2);
    }

}