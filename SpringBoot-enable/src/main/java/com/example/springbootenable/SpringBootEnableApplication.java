package com.example.springbootenable;

import com.example.config.EnableUser;
import com.example.config.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @ComponentScan 扫描范围：当前引导类所在包及其自爆
 *
 * 1.使用@ComponentScan 扫描 com.example.config包
 * 2.使用@Import注解，加载类。这些类都会被Spring创建加入IOC容器
 * 3.可以对Import注解进行封装
 */

@SpringBootApplication
//@ComponentScan("com.example.config")
//@Import(UserConfig.class)
@EnableUser
public class SpringBootEnableApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootEnableApplication.class, args);

        //获取Bean
        Object user = context.getBean("user");
        System.out.println(user);
    }

}
