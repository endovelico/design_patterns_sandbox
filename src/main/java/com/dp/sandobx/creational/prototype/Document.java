package com.dp.sandobx.creational.prototype;

// ===== Step 1: Prototype Interface =====
interface Document extends Cloneable {
    Document clone();           // Prototype method
    void display();             // Show the content
    void setContent(String content);
    void setTitle(String title);
}
