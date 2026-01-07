package com.dp.sandobx.creational.builder;

// ===== Step 1: Product Class =====
public class Pizza {
    // Required parameters
    private final String dough;
    private final String sauce;

    // Optional parameters
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean bacon;

    // Private constructor to enforce usage of Builder
    Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.bacon = builder.bacon;
    }

    @Override
    public String toString() {
        return "Pizza [dough=" + dough + ", sauce=" + sauce +
                ", cheese=" + cheese + ", pepperoni=" + pepperoni +
                ", bacon=" + bacon + "]";
    }
}