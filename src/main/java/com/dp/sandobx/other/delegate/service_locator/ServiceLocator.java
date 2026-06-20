/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.sandobx.other.delegate.service_locator;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {

    private static final Map<Class<?>, Object> services = new HashMap<>();

    public static <T> void register(Class<T> type, T service) {
        services.put(type, service);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getService(Class<T> type) {
        return (T) services.get(type);
    }
}