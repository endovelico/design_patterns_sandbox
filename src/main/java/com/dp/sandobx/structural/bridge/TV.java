package com.dp.sandobx.structural.bridge;

// ===== Step 2: Concrete Implementors =====
class TV implements Device {
    private int volume = 50;

    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + volume);
    }
}
