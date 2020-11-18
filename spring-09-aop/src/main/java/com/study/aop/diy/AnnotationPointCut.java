package com.study.aop.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author wzz
 * @create 2020-11-17 21:41
 **/
@Aspect//标注这个类是一个切面
public class AnnotationPointCut {
    //方法执行前
    @Before("execution(* com.study.aop.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前");
    }

    //方法执行后
    @After("execution(* com.study.aop.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行后");
    }

    //在环绕增强中,我们可以给定一个参数,代表我们要获取处理切入的点
    @Around("execution(* com.study.aop.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        //执行方法
        Object proceed = jp.proceed();
        System.out.println("环绕后");
    }
}