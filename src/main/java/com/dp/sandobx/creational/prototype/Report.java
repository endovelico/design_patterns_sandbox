package com.dp.sandobx.creational.prototype;

// ===== Step 2: Concrete Prototype Classes =====
class Report implements Document {
    private String title;
    private String content;
    private String header;
    private String footer;

    // Constructor with predefined fields
    public Report() {
        this.title = "Default Report Title";
        this.content = "Default report content...";
        this.header = "=== Report Header ===";
        this.footer = "=== Report Footer ===";
    }

    @Override
    public Report clone() {
        try {
            Report cloned = (Report) super.clone();
            // Optional: reset or tweak fields for new clone
            cloned.content = this.content; // you could copy or reset if needed
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void display() {
        System.out.println(header);
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println(footer);
        System.out.println();
    }

    @Override
    public void setContent(String content) { this.content = content; }

    @Override
    public void setTitle(String title) { this.title = title; }
}