package com.study.proxy.demo01;

/**
 * 真实角色，房东要租房子
 * @author wzz
 * @create 2020-11-16 21:01
 **/

public class Host implements Rent {
    public void rent() {
        System.out.println("房东出租房子");
    }
}