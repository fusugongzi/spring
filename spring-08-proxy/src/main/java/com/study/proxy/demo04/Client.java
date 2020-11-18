package com.study.proxy.demo04;

import com.study.proxy.demo02.UserService;
import com.study.proxy.demo02.UserServiceImpl;


/**
 * @author wzz
 * @create 2020-11-16 22:33
 **/

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserService userService = new UserServiceImpl();

        //动态生产的代理角色
        MyInvocationHandler invocationHandler = new MyInvocationHandler();
        invocationHandler.setRent(userService);
        UserService proxyUserService = (UserService) invocationHandler.getProxy();
        proxyUserService.add();
    }
}