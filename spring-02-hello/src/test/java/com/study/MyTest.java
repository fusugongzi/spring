package com.study;

import com.study.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wzz
 * @create 2020-11-12 20:46
 **/

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello = (Hello) applicationContext.getBean("hello");
        System.out.println(hello);
    }
}