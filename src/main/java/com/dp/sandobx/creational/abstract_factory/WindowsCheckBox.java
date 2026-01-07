package com.dp.sandobx.creational.abstract_factory;



class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows-style Checkbox");
    }
}
