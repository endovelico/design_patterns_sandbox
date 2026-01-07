package com.dp.sandobx.creational.abstract_factory;

class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Mac-style Button");
    }
}