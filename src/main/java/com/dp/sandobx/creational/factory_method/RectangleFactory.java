package com.dp.sandobx.creational.factory_method;

class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}