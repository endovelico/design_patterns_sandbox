package com.dp.sandobx.behavioral.visitor;

// ===== Element Interface =====
interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
