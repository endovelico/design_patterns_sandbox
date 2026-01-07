package com.dp.sandobx.structural.bridge;

// ===== Step 4: Refined Abstraction =====
class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void volumeUp() {
        device.setVolume(100); // just max volume for simplicity
    }

    @Override
    public void volumeDown() {
        device.setVolume(0);   // mute
    }
}
