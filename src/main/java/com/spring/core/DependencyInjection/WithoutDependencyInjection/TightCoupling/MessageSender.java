package com.spring.core.DependencyInjection.WithoutDependencyInjection.TightCoupling;

public class MessageSender {
    //private SMSService smsService;
    private EmailService emailService;

//    public MessageSender(SMSService smsService) {
//        this.smsService = smsService;
//    }

    public MessageSender(EmailService emailService) {
        this.emailService = emailService;
    }

//    public void sendMessage(String message) {
//        this.smsService.sendMessage(message);
//    }

    public void sendMessage(String message) {
        this.emailService.sendMessage(message);
    }
}



