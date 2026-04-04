package com.dp.sandobx.behavioral.intreperter.refactor;

class EvalVisitor implements Visitor {

    int result; // will store the result of visiting a node

    public void visit(Number n) {
        result = n.intValue();
    }

    public void visit(Add a) {
        a.left.accept(this);
        int left = result;

        a.right.accept(this);
        int right = result;

        result = left + right;
    }

    public void visit(Multiply m) {
        m.left.accept(this);
        int left = result;

        m.right.accept(this);
        int right = result;

        result = left * right;
    }
}