package com.example.springboottest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
//子目录或者相同目录不需要 .class
@SpringBootTest
public class UserServiceTest {
    @Autowired
    public UserService userService;

    @Test
    public void testAdd(){
        userService.add();
    }
}
