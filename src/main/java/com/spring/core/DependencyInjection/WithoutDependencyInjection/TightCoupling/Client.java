package com.spring.core.DependencyInjection.WithoutDependencyInjection.TightCoupling;

public class Client {
    public static void main(String[] args) {

        String message = "Hello, Good Morning! have a nice day :) ";
        SMSService smsService = new SMSService();
        EmailService emailService = new EmailService();
       // MessageSender messageSender = new MessageSender(smsService);
        // messageSender.sendMessage(message);

        MessageSender messageSender = new MessageSender(emailService);
        emailService.sendMessage(message);
    }
}


