package com.dp.sandobx.creational.builder;

// ===== Step 3: Client Code =====
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder("Thin Crust", "Tomato")
                .addCheese()
                .addPepperoni()
                .build();

        System.out.println(pizza);
        // Output: Pizza [dough=Thin Crust, sauce=Tomato, cheese=true, pepperoni=true, bacon=false]
    }
}
