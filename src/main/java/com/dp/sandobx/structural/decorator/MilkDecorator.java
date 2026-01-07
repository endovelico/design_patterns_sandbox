package com.dp.sandobx.structural.decorator;

// ===== Step 4: Concrete Decorators =====
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }

    @Override
    public String ingredients() {
        return super.ingredients() + ", Milk";
    }
}
