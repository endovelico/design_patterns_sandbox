package com.dp.sandobx.creational.factory_method;

// Step 5: Client code
public class FactoryMethodDemo {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();

        // Using the factory to create shapes
        Shape circle = circleFactory.createShape();
        Shape rectangle = rectangleFactory.createShape();

        circle.draw();      // Output: Drawing a Circle
        rectangle.draw();   // Output: Drawing a Rectangle

        // Using optional renderShape() helper
        circleFactory.renderShape();   // Output: Drawing a Circle
        rectangleFactory.renderShape();// Output: Drawing a Rectangle
    }
}
