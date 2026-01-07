package com.dp.sandobx.structural.facade;

class Projector {
    public void on() { System.out.println("Projector on"); }
    public void off() { System.out.println("Projector off"); }
    public void setInput(String input) { System.out.println("Projector input set to " + input); }
}
