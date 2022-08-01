package com.example.test;

import com.example.springboottest.SpringBootTestApplication;
import com.example.springboottest.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootTestApplication.class)
public class UserServiceTest {
    @Autowired
    public UserService userService;

    @Test
    public void testAdd(){
        userService.add();
    }
}
