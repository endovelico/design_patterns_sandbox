package com.dp.sandobx.behavioral.mediator;


// ===== Colleague =====
class User {
    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String message) {
        chatMediator.showMessage(name, message);
    }
}