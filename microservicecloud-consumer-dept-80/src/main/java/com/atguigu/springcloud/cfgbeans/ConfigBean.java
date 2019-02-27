package com.atguigu.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {  //添加@Configuration的 = spring的appliactionContext.xml  主要是声明bean 的

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}

// 之前 <bean id="userService" name="com.atguigu.server.UserServiceImpl">
/**
 * 现在
 * @bean
 * public UserService getUserService(){
 *     return new UserServiceImpl;
 * }
 */
