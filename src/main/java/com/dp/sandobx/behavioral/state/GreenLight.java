package com.dp.sandobx.behavioral.state;

class GreenLight implements TrafficLightState {
    @Override
    public void handleRequest() {
        System.out.println("Go! Green light.");
    }
}