package com.dp.sandobx.behavioral.intreperter.refactor;

interface Expression {

    void accept(Visitor v);
}