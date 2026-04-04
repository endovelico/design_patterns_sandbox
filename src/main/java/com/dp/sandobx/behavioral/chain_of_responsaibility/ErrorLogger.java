package com.dp.sandobx.behavioral.chain_of_responsaibility;

class ErrorLogger extends Logger {
    @Override
    protected boolean canHandle(String level) {
        return level.equalsIgnoreCase("ERROR");
    }

    @Override
    protected void write(String message) {
        System.out.println("[ERROR]: " + message);
    }
}