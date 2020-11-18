package com.study.proxy.demo01;

/**
 * 客户
 * @author wzz
 * @create 2020-11-16 21:04
 **/

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色，在真实角色实现的方法上，会有些附加操作。
        Proxy proxy = new Proxy(host);

        proxy.rent();
    }
}