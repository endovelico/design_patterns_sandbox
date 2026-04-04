package com.dp.sandobx.behavioral.chain_of_responsaibility;

// ===== Handler Interface / Abstract Class =====
abstract class Logger {
    protected Logger nextLogger;

    public void setNext(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(String level, String message) {
        if (canHandle(level)) {
            write(message);
        } else if (nextLogger != null) {
            nextLogger.log(level, message); // pass to next
        }
    }

    protected abstract boolean canHandle(String level);
    protected abstract void write(String message);
}