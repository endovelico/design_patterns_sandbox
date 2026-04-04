package com.dp.sandobx.behavioral.observer;


class TVChannel implements Observer {
    private String name;

    public TVChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " broadcasted news: " + message);
    }
}