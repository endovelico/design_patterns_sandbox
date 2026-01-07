package com.dp.sandobx.structural.decorator;

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }

    @Override
    public String ingredients() {
        return super.ingredients() + ", Sugar";
    }
}
