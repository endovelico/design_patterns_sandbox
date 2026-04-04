package com.dp.sandobx.behavioral.state;

// ===== Client =====
public class StatePatternDemo {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        light.setState(new RedLight());
        light.request();

        light.setState(new GreenLight());
        light.request();

        light.setState(new YellowLight());
        light.request();
    }
}