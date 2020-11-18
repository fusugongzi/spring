package com.study.config.config;

import com.study.config.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author wzz
 * @create 2020-11-15 22:55
 **/
//@Configuration标记这是一个配置类，相当于xml里面的 <beans>标签
@Configuration
//@Import标签相当于xml的 <import>，可以将多个配置类合并成一个
@Import(MyConfig2.class)
public class MyConfig {

    //@Bean标注这是一个bean，相当于xml的<bean>标签
    // 方法返回类型User相当于 bean标签的 class
    // 方法返回方法名称user相当于bean的id
    @Bean
    public User user() {
        return new User();
    }
}