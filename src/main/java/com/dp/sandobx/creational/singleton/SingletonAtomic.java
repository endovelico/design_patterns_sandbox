package com.dp.sandobx.creational.singleton;

import java.util.concurrent.atomic.AtomicReference;

public class SingletonAtomic {

    private static final AtomicReference<SingletonAtomic> INSTANCE =
            new AtomicReference<>();

    private SingletonAtomic() {
        // Prevent external instantiation
    }

    public static SingletonAtomic getInstance() {
        SingletonAtomic instance = INSTANCE.get();
        if (instance != null) {
            return instance;
        }

        SingletonAtomic newInstance = new SingletonAtomic();

        if (INSTANCE.compareAndSet(null, newInstance)) {
            return newInstance; // We won the race
        }

        // Another thread initialized it first
        return INSTANCE.get();
    }
}
