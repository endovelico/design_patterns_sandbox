package com.dp.sandobx.creational.abstract_factory;

class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Mac-style Checkbox");
    }
}