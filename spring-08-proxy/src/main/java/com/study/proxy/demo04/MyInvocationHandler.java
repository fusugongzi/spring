package com.study.proxy.demo04;

import com.study.proxy.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用这个类,自动生产代理类
 * @author wzz
 * @create 2020-11-16 22:26
 **/
public class MyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object rent;

    public void setRent(Object rent) {
        this.rent = rent;
    }

    /**
     * 生成得到代理类
     * @return
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),
                this);
    }

    /**
     * 处理代理类，并且返回结果
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        return method.invoke(rent, args);
    }

    public void log(String msg) {
        System.out.println("调用 " + msg + " 方法");
    }
}