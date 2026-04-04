package com.dp.sandobx.behavioral.chain_of_responsaibility;


// ===== Client =====
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        // Setup chain: Info → Debug → Error
        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();
        Logger errorLogger = new ErrorLogger();

        infoLogger.setNext(debugLogger);
        debugLogger.setNext(errorLogger);

        // Send messages
        infoLogger.log("INFO", "This is an info message.");
        infoLogger.log("DEBUG", "This is a debug message.");
        infoLogger.log("ERROR", "This is an error message.");
        infoLogger.log("WARN", "This is a warning message.");
    }
}