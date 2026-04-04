package com.dp.sandobx.behavioral.memento;

// ===== Originator =====
class TextEditor {
    private String text;

    public void write(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento memento) {
        this.text = memento.getState();
    }
}