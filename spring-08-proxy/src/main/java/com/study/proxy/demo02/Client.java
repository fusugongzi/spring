package com.study.proxy.demo02;

/**
 * 客户类
 * 比如原先业务代码是UserServiceImpl,现在要新增一个功能,调用方法的时候打日志出来。
 * 则可以通过代理设计模式,在不改变原有UserServiceImpl类的基础上,新增一个UserServiceProxyImpl,
 * 来实现此次的功能,这样实现起来比较优雅方便。
 * @author wzz
 * @create 2020-11-16 21:38
 **/

public class Client {
    public static void main(String[] args) {
        UserServiceProxyImpl userServiceProxy = new UserServiceProxyImpl();
        userServiceProxy.setUserServiceImpl(new UserServiceImpl());

        userServiceProxy.add();
    }
}