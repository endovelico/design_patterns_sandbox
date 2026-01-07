package com.dp.sandobx.structural.proxy;


// ===== Proxy =====
class ProxyImage implements Image {
    private String filename;
    private RealImage realImage; // reference to real object

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {  // lazy initialization
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
