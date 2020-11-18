package com.study.pojo;

/**
 * @author wzz
 * @create 2020-11-12 21:40
 **/

public class User {

    private String name;

    public User(String name) {
        this.name = name;
        System.out.println("User被创建了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}