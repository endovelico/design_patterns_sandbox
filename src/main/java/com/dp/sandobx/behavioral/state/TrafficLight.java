package com.dp.sandobx.behavioral.state;

// ===== Context =====
class TrafficLight {
    private TrafficLightState state;

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
    }
}
