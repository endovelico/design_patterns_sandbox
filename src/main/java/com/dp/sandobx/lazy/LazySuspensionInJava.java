/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.sandobx.lazy;

import java.util.function.Supplier;

/**
 *
 * @author endovelico
 */
public class LazySuspensionInJava<T> {
    
    private Supplier<T> supplier;
    private T value;
    private boolean computed = false;

    LazySuspensionInJava(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    T get() {
        if (!computed) {
            value = supplier.get();
            computed = true;
        }
        return value;
    }
}
