package com.dp.sandobx.behavioral.template_method;

// ===== Concrete Template 1 =====
class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea leaves");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
