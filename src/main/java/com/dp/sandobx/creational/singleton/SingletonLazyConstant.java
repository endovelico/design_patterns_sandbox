/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.sandobx.creational.singleton;

/**
 *
 * @author endovelico
 */
public class SingletonLazyConstant {
    
    // Prevent external instantiation
    private SingletonLazyConstant static {
        System.out.println("Singleton created");
    }

    // Lazily initialized singleton instance
    private static final LazyConstant<Singleton> INSTANCE =
            LazyConstant.of(Singleton::new);

    // Global access point
    public static Singleton getInstance() {
        return INSTANCE.get();
    }

    public void doWork() {
        System.out.println("Doing work...");
    }
}
