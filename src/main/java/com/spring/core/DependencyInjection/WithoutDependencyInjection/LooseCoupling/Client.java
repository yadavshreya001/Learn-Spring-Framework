package com.spring.core.DependencyInjection.WithoutDependencyInjection.LooseCoupling;

public class Client {
    public static void main(String[] args) {
        String message = "Hello, Good Morning! have a nice day :) ";
        SMSService smsService = new SMSService();
        EmailService emailService = new EmailService();
        MessageSender messageSender = new MessageSender(emailService);
        messageSender.sendMessage(message);
    }
}


