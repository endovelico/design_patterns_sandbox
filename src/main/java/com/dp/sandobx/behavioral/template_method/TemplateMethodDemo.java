package com.dp.sandobx.behavioral.template_method;

// ===== Client =====
public class TemplateMethodDemo {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("Making Tea:");
        tea.prepareBeverage();

        System.out.println("\nMaking Coffee:");
        coffee.prepareBeverage();
    }
}