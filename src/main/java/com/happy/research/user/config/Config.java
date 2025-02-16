package com.happy.research.user.config;

import com.happy.research.user.controller.LoginController;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Config {

    @Autowired
    private ApplicationContext applicationContext;
//    @PostConstruct
    public void inti(){
        applicationContext.getBean(LoginController.class);
    }
}
