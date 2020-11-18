package com.study.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

/**
 * @author wzz
 * @create 2020-11-15 21:42
 **/

public class People {

   /* @Autowired
    @Qualifier(value = "cat1")*/
    @Resource
    private Cat cat;

    public Cat getCat() {
        return cat;
    }
}