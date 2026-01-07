package com.dp.sandobx.structural.flyweight;

// ===== Flyweight =====
class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void display(int x, int y) {
        System.out.println(name + " tree at (" + x + "," + y + ") with color " + color);
    }
}