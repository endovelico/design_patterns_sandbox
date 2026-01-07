package com.dp.sandobx.structural.flyweight;


import java.util.List;
import java.util.ArrayList;

// ===== Client =====
public class FlyweightDemo {
    public static void main(String[] args) {
        List<Tree> forest = new ArrayList<>();

        TreeType oakType = TreeFactory.getTreeType("Oak", "Green", "Rough");
        TreeType pineType = TreeFactory.getTreeType("Pine", "Dark Green", "Smooth");

        forest.add(new Tree(10, 20, oakType));
        forest.add(new Tree(30, 50, oakType));
        forest.add(new Tree(15, 25, pineType));
        forest.add(new Tree(40, 60, pineType));

        // Display all trees
        for (Tree tree : forest) {
            tree.display();
        }
    }
}
