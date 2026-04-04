package com.dp.sandobx.behavioral.command;

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) { this.light = light; }

    @Override
    public void execute() { light.off(); }
}
