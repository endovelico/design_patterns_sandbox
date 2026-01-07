package com.dp.sandobx.structural.decorator;

// ===== Step 2: Concrete Component =====
class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 5.0;
    }

    @Override
    public String ingredients() {
        return "Coffee";
    }
}