package com.study.autowired;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wzz
 * @create 2020-11-13 22:59
 **/

public class MyTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        People people1 = context.getBean("people1", People.class);
        people1.getCat().shout();
        people1.getDog().shout();

        People people2 = context.getBean("people2", People.class);
        people2.getCat().shout();
        people2.getDog().shout();
    }
}