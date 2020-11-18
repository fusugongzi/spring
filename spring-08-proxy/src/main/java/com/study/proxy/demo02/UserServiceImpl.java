package com.study.proxy.demo02;


/**
 * 真实角色
 * @author wzz
 * @create 2020-11-16 21:37
 **/

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("add");
    }

    public void delete() {
        System.out.println("delete");
    }

    public void update() {
        System.out.println("update");
    }

    public void query() {
        System.out.println("query");
    }
}