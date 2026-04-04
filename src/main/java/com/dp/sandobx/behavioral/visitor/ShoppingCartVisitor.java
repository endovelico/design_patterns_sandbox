package com.dp.sandobx.behavioral.visitor;

// ===== Visitor Interface =====
interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}