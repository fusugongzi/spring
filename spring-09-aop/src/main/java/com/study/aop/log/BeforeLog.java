package com.study.aop.log;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author wzz
 * @create 2020-11-16 23:19
 **/

public class BeforeLog implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("准被调用类 " + target.getClass().getName() + " 的 " +
                method.getName() + " 方法,参数: " + objects);
    }
}