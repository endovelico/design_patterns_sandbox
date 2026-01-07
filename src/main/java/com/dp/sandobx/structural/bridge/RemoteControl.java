package com.dp.sandobx.structural.bridge;


// ===== Step 3: Abstraction =====
abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void volumeUp();
    public abstract void volumeDown();
}