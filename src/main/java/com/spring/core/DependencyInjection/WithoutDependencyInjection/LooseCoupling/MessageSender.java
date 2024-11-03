package com.spring.core.DependencyInjection.WithoutDependencyInjection.LooseCoupling;

public class MessageSender {
    private MessageService messageService;

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String message) {
        this.messageService.sendMessage(message);
    }
}

