package com.dp.sandobx.behavioral.intreperter.refactor;

// Multiply.java
public class Multiply implements Expression {

    Expression left, right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Accept a visitor
    public void accept(Visitor v) {
        v.visit(this);
    }
}
