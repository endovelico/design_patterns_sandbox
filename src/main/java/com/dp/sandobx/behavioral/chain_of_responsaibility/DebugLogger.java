package com.dp.sandobx.behavioral.chain_of_responsaibility;

class DebugLogger extends Logger {
    @Override
    protected boolean canHandle(String level) {
        return level.equalsIgnoreCase("DEBUG");
    }

    @Override
    protected void write(String message) {
        System.out.println("[DEBUG]: " + message);
    }
}