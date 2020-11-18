package com.study.aop.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author wzz
 * @create 2020-11-16 23:23
 **/

public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) {
        System.out.println("执行了方法 " + method.getName() + "的返回结果: " + returnValue);
    }
}