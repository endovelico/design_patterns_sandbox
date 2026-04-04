package com.dp.sandobx.behavioral.mediator;

// ===== Concrete Mediator =====
class ChatRoom implements ChatMediator {
    @Override
    public void showMessage(String user, String message) {
        System.out.println(user + ": " + message);
    }
}
