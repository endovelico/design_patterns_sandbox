package com.dp.sandobx.creational.abstract_factory;

class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows-style Button");
    }
}