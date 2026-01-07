package com.dp.sandobx.creational.factory_method;

// Step 4: Concrete Creators
class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}