package com.dp.sandobx.behavioral.template_method;

// ===== Template =====
abstract class Beverage {
    // template method (final so steps sequence cannot be changed)
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    // steps that vary will be implemented by subclasses
    protected abstract void brew();
    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
