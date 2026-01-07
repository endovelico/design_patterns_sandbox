package com.dp.sandobx.creational.singleton;

public class SingletonBillPugh {
    private SingletonBillPugh() {}

    // Inner static class responsible for holding the Singleton instance
    private static class Holder {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return Holder.INSTANCE;
    }
}
