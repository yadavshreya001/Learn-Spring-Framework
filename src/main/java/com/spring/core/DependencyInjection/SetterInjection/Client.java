package com.spring.core.DependencyInjection.SetterInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        String message = "Hello, Good Morning, Have a nice day :) ";
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage(message);

    }
}


