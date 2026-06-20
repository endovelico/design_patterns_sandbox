/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.sandobx.structural.flyweight;

/**
 *
 * @author endovelico
 */
class Tree {

    private int x; // extrinsic
    private int y; // extrinsic
    private TreeType type; // shared flyweight

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.render(x, y);
    }
}