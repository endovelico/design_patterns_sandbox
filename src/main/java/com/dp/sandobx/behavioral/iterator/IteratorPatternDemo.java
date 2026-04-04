package com.dp.sandobx.behavioral.iterator;


import java.util.Iterator;

// ===== Client =====
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository repo = new NameRepository();
        Iterator<String> iterator = repo.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
