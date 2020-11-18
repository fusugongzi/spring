package com.study.aop.service;

/**
 * @author wzz
 * @create 2020-11-16 23:18
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

    public void select() {
        System.out.println("select");
    }
}