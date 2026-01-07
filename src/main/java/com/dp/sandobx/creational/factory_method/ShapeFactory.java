package com.dp.sandobx.creational.factory_method;

// Step 3: The Creator (Factory) abstract class
abstract class ShapeFactory {
    // Factory Method
    public abstract Shape createShape();

    // Optional: some common operation
    public void renderShape() {
        Shape shape = createShape();
        shape.draw();
    }
}