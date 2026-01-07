package com.dp.sandobx.structural.proxy;

// ===== Client =====
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Images are loaded only when display is called
        image1.display();
        image1.display(); // doesn't load again
        image2.display();
    }
}
