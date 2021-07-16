package com.basicconcepts;

import org.springframework.stereotype.Component;

@Component
public class NotifyByPhone implements Notification{
    @Override
    public void Notify() {
        System.out.println("Notify By Phone!");
    }
}
