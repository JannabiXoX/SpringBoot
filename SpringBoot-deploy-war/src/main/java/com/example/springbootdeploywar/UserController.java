package com.example.springbootdeploywar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/findAll")
    public String finaAll(){
        return "sucdess";
    }
}
