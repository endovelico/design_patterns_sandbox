package com.dp.sandobx.behavioral.observer;


// ===== Concrete Observers =====
class Newspaper implements Observer {
    private String name;

    public Newspaper(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received news: " + message);
    }
}