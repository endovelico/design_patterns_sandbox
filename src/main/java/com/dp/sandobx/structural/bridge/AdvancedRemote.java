package com.dp.sandobx.structural.bridge;

class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
        System.out.println("Advanced remote: welcome message displayed");
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void volumeUp() {
        device.setVolume(70); // more granular control could be added
    }

    @Override
    public void volumeDown() {
        device.setVolume(20);
    }
}
