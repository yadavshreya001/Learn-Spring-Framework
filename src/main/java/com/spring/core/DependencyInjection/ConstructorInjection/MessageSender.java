package com.spring.core.DependencyInjection.ConstructorInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService messageService;
    private MessageService smsService;

//    @Autowired
//    public MessageSender(@Qualifier("emailService") MessageService messageService) {
//        this.messageService = messageService;
//        System.out.println("Constructor based Dependency Injection 1");
//    }

    @Autowired
    public MessageSender(@Qualifier("emailService") MessageService messageService , @Qualifier("smsService") MessageService smsService){
        this.messageService = messageService;
        this.smsService = smsService;
        System.out.println("Constructor based Dependency Injection 2");
    }

    public void sendMessage(String message) {
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }
}



