package com.dp.sandobx.behavioral.memento;


// ===== Caretaker =====
class History {
    private final Stack<TextMemento> history = new Stack<>();

    public void push(TextMemento memento) {
        history.push(memento);
    }

    public TextMemento pop() {
        return history.pop();
    }
}