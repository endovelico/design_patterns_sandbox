package com.dp.sandobx.behavioral.memento;


// ===== Client =====
public class MementoPatternDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello");
        history.push(editor.save());

        editor.write("Hello, World!");
        history.push(editor.save());

        editor.write("Hello, World! How are you?");
        System.out.println("Current Text: " + editor.getText());

        // Undo last change
        editor.restore(history.pop());
        System.out.println("After Undo: " + editor.getText());

        // Undo again
        editor.restore(history.pop());
        System.out.println("After Undo again: " + editor.getText());
    }
}