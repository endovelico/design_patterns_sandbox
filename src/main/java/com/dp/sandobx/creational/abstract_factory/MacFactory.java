package com.dp.sandobx.creational.abstract_factory;

// ===== Step 4: Concrete Factories =====
class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
