package com.dp.sandobx.behavioral.chain_of_responsaibility;


// ===== Concrete Handlers =====
class InfoLogger extends Logger {
    @Override
    protected boolean canHandle(String level) {
        return level.equalsIgnoreCase("INFO");
    }

    @Override
    protected void write(String message) {
        System.out.println("[INFO]: " + message);
    }
}
