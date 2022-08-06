package com.example.springbootlistener.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner...run ");
//        for (int i = 0; i < args.getSourceArgs().length; i++) {
//            System.out.println(args.getSourceArgs());
//        }
        System.out.println(Arrays.asList(args.getSourceArgs()));
    }
}
