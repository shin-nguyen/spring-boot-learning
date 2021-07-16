package com.basicconcepts;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Primary
@Scope("prototype")
public class NotifyByEmail implements Notification{

    @Override
    public void Notify() {
        System.out.println("Notify By Email!");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Run this function after initialization Bean!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Run this function before destroy Bean! ");
    }
}
