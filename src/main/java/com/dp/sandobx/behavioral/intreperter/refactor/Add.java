package com.dp.sandobx.behavioral.intreperter.refactor;

class Add implements Expression {

    Expression left, right;

    public void accept(Visitor v) {
        v.visit(this);
    }
}