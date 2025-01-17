package com.spring.core.DependencyInjection.FieldInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    @Autowired
    @Qualifier("emailService")
    private MessageService messageService;

    private MessageService smsService;

    public void sendMessage(String message) {
        this.messageService.sendMessage(message);
    }
}



