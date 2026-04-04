package com.dp.sandobx.behavioral.intreperter.refactor;

interface Visitor {

    void visit(Number n);
    void visit(Add a);
    void visit(Multiply m);
}
