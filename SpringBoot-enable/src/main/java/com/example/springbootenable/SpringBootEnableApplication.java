package com.example.springbootenable;

import com.example.config.EnableUser;
import com.example.config.MyImportBeanDefinitionRegistrar;
import com.example.config.MyImportSelector;
import com.example.config.UserConfig;
import com.example.domain.Role;
import com.example.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import redis.clients.jedis.Jedis;

import java.util.Map;

/**
 * @ComponentScan 扫描范围：当前引导类所在包及其自爆
 *
 * 1.使用@ComponentScan 扫描 com.example.config包
 * 2.使用@Import注解，加载类。这些类都会被Spring创建加入IOC容器
 * 3.可以对Import注解进行封装
 */

/**
 * Import 4种用法
 * 1.导入Bean
 * 2.导入配置类
 * 3.导入ImportSelector的实现类
 * 4.ImportBeanDefinitionRegistrar实现类
 */

//@ComponentScan("com.example.config")
//@Import(UserConfig.class)
//@EnableUser

//@Import(User.class)
//@Import(UserConfig.class)
//@Import(MyImportSelector.class)
//@Import(MyImportBeanDefinitionRegistrar.class )
@SpringBootApplication
public class SpringBootEnableApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootEnableApplication.class, args);

        //获取Bean
//        Object user = context.getBean("user");
//        System.out.println(user);
//        User user = context.getBean(User.class);
//        System.out.println(user);
//
//        Role role = context.getBean(Role.class);
//        System.out.println(role);

//        Map<String,User> map = context.getBeansOfType(User.class);
//        System.out.println(map);
        Jedis jedis = context.getBean(Jedis.class);
        System.out.println(jedis);

        jedis.set("name","itcast");
        String name = jedis.get("name");
        System.out.println(name);
    }

    @Bean
    public Jedis jedis(){
        return new Jedis("localhost",6379);
    }
}
