/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.sandobx.structural.flyweight;

/**
 *
 * @author endovelico
 */
class TreeType {

    private final String name;        // intrinsic
    private final String color;       // intrinsic
    private final String texture;     // intrinsic

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void render(int x, int y) {
        System.out.println(
            "Rendering " + name +
            " tree with color " + color +
            " and texture " + texture +
            " at (" + x + "," + y + ")"
        );
    }
}