package com.spring.core.DependencyInjection.WithoutDependencyInjection.LooseCoupling;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}


