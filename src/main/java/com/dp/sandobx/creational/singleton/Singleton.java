package com.dp.sandobx.creational.singleton;

// Singleton Class
public class Singleton {
    // Static variable to hold single instance
    private static Singleton instance;

    // Private constructor prevents instantiation from other classes
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Lazy initialization
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton is doing something...");
    }
}