package com.study;

import com.study.dao.UserDaoImpl;
import com.study.dao.UserDaoMysqlImpl;
import com.study.service.UserService;
import com.study.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wzz
 * @create 2020-11-11 22:17
 **/

public class MyTest {
    public static void main(String[] args) {
        /*UserService userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();*/

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        userService.getUser();
    }
}