package com.study.anno.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wzz
 * @create 2020-11-15 22:23
 **/
@Component
public class User {
//    @Value("wzz")
    public String name;

    @Value("wzz")
    public void setName(String name) {
        this.name = name;
    }
}