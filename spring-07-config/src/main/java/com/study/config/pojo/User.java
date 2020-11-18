package com.study.config.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wzz
 * @create 2020-11-15 22:54
 **/
//@Component标记这个类是一个组件，注入到spring容器。
@Component
public class User {
    //使用@Value注入属性
    @Value("wzz")
    public String name;
}