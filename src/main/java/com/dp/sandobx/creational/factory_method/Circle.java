package com.dp.sandobx.creational.factory_method;

// Step 2: Concrete Products
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
