package com.dp.sandobx.creational.builder;

// ===== Step 2: Builder Class =====
public class PizzaBuilder {
    // Required parameters
    final String dough;
    final String sauce;

    // Optional parameters - initialized to default values
    boolean cheese = false;
    boolean pepperoni = false;
    boolean bacon = false;

    public PizzaBuilder(String dough, String sauce) {
        this.dough = dough;
        this.sauce = sauce;
    }

    public PizzaBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public PizzaBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public PizzaBuilder addBacon() {
        this.bacon = true;
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }
}
