package com.dp.sandobx.creational.abstract_factory;

// ===== Step 5: Client =====
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Suppose we want Mac-style UI
        GUIFactory macFactory = new MacFactory();
        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();
        macButton.paint();      // Output: Rendering a Mac-style Button
        macCheckbox.paint();    // Output: Rendering a Mac-style Checkbox

        // Suppose we want Windows-style UI
        GUIFactory windowsFactory = new WindowsFactory();
        Button winButton = windowsFactory.createButton();
        Checkbox winCheckbox = windowsFactory.createCheckbox();
        winButton.paint();      // Output: Rendering a Windows-style Button
        winCheckbox.paint();    // Output: Rendering a Windows-style Checkbox
    }
}
