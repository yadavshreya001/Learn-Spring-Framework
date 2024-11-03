package com.spring.core.DependencyInjection.SetterInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService messageService;
    private MessageService smsService;

   @Autowired
    public void setMessageService(@Qualifier("emailService")MessageService messageService) {
        this.messageService = messageService;
        System.out.println("Setter based Dependency Injection 1");
    }

//    @Autowired
//    public void setSmsService(@Qualifier("smsService") MessageService smsService) {
//        this.smsService = smsService;
//        System.out.println("Setter based Dependency Injection 2");
//    }

    public void sendMessage(String message) {
        this.messageService.sendMessage(message);
    }
}



