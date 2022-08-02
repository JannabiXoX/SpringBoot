package com.example.springbootcondition.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

//注解加载的类的范围和方法范围
@Target({ElementType.TYPE, ElementType.METHOD})
//注解生效时机
@Retention(RetentionPolicy.RUNTIME)
//生成Java Doc文档
@Documented
@Conditional(ClassCondition.class)
public @interface ConditionOnClass {
    String[] value();
}
