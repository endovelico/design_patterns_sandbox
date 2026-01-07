package com.dp.sandobx.structural.flyweight;

// ===== Context (Extrinsic State) =====
class Tree {
    private int x;
    private int y;
    private TreeType type; // intrinsic

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void display() {
        type.display(x, y);
    }
}
