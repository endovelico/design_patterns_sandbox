package com.dp.sandobx.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// ===== Flyweight Factory =====
class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "-" + color + "-" + texture;
        treeTypes.putIfAbsent(key, new TreeType(name, color, texture));
        return treeTypes.get(key);
    }
}