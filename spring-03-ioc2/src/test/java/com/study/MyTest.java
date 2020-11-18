package com.study;

import com.study.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wzz
 * @create 2020-11-12 21:41
 **/

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) context.getBean("user");
        User user1 = (User) context.getBean("user");

        user.show();
        System.out.println(user == user1);
    }
}