package com.dp.sandobx.structural.decorator;

// ===== Step 5: Client =====
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.ingredients() + " $" + coffee.cost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.ingredients() + " $" + milkCoffee.cost());

        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugarCoffee.ingredients() + " $" + milkSugarCoffee.cost());
    }
}