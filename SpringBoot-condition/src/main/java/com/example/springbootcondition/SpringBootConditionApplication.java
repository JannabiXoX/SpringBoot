package com.example.springbootcondition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootConditionApplication {

    public static void main(String[] args) {
        //启动springboot的应有，返回Spring的IOC容器
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootConditionApplication.class, args);
        //获取Bean,redisTemplate
//        Object redisTemplate =context.getBean("redisTemplate");
//        System.out.println(redisTemplate);


        Object user = context.getBean("user");
        Object user2 = context.getBean("user2");
        System.out.println(user);
        System.out.println(user2);
    }

}
