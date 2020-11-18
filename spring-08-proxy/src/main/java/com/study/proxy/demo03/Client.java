package com.study.proxy.demo03;

/**
 * @author wzz
 * @create 2020-11-16 22:30
 **/

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        MyInvocationHandler invocationHandler = new MyInvocationHandler();
        invocationHandler.setRent(host);

        Rent rent = (Rent) invocationHandler.getProxy();
        rent.rent();
    }
}