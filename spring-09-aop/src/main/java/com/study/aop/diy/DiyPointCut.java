package com.study.aop.diy;

/**
 * @author wzz
 * @create 2020-11-17 21:13
 **/

public class DiyPointCut {

    public void before() {
        System.out.println("方法执行前");
    }

    public void after() {
        System.out.println("方法执行后");
    }
}