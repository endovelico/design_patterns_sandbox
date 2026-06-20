package com.dp.sandobx.other.delegation;

public class DelegationPattern {

    private DelegationHandler handler;

    void click() {
        handler.handle();
    }
}
