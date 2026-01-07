package com.dp.sandobx.structural.bridge;

// ===== Step 5: Client =====
public class BridgePatternDemo {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl basicTvRemote = new BasicRemote(tv);
        RemoteControl advancedRadioRemote = new AdvancedRemote(radio);

        basicTvRemote.turnOn();
        basicTvRemote.volumeUp();

        advancedRadioRemote.turnOn();
        advancedRadioRemote.volumeDown();
    }
}