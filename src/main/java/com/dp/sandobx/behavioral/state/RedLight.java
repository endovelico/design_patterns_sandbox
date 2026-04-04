package com.dp.sandobx.behavioral.state;

// ===== Concrete States =====
class RedLight implements TrafficLightState {
    @Override
    public void handleRequest() {
        System.out.println("Stop! Red light.");
    }
}
