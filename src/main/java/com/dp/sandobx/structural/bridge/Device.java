package com.dp.sandobx.structural.bridge;

// ===== Step 1: Implementor Interface =====
interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
