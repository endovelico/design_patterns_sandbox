package com.dp.sandobx.behavioral.state;

class YellowLight implements TrafficLightState {
    @Override
    public void handleRequest() {
        System.out.println("Caution! Yellow light.");
    }
}
