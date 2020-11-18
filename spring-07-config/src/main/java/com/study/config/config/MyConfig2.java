package com.study.config.config;

import com.study.config.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wzz
 * @create 2020-11-15 23:00
 **/
@Configuration
public class MyConfig2 {

    @Bean
    public User user2() {
        return new User();
    }

}