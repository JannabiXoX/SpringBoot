package com.example.config;

import com.example.domain.Role;
import com.example.domain.User;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry){
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(User.class).getBeanDefinition();
        AbstractBeanDefinition beanDefinition1 = BeanDefinitionBuilder.rootBeanDefinition(Role.class).getBeanDefinition();
        registry.registerBeanDefinition("user",beanDefinition);
        registry.registerBeanDefinition("role",beanDefinition1);
    }
}
