package com.study.service;

import com.study.dao.UserDao;

public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);
}
