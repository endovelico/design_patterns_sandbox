package com.dp.sandobx.structural.decorator;

// ===== Step 3: Decorator =====
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // wrap a Coffee object

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost();
    }

    @Override
    public String ingredients() {
        return coffee.ingredients();
    }
}