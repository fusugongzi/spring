package com.study.service;

import com.study.dao.UserDao;
import com.study.dao.UserDaoImpl;
import com.study.dao.UserDaoMysqlImpl;

/**
 * @author wzz
 * @create 2020-11-11 22:17
 **/

public class UserServiceImpl implements UserService {
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}