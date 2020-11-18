package com.study.proxy.demo02;

/**
 * 代理角色
 * @author wzz
 * @create 2020-11-16 21:38
 **/

public class UserServiceProxyImpl implements UserService {
    private UserServiceImpl userService;

    public UserServiceProxyImpl() {
    }

    public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
        this.userService = userServiceImpl;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg) {
        System.out.println("调用 " + msg + " 方法");
    }
}