package com.dp.sandobx.creational.prototype;


class Invoice implements Document {
    private String title;
    private String content;
    private String invoiceNumber;
    private String footer;

    // Constructor with predefined template values
    public Invoice() {
        this.title = "Default Invoice";
        this.content = "Invoice items:";
        this.invoiceNumber = "INV-0000";
        this.footer = "--- End of Invoice ---";
    }

    @Override
    public Invoice clone() {
        try {
            Invoice cloned = (Invoice) super.clone();
            // Optional: reset or tweak fields
            cloned.invoiceNumber = "INV-" + ((int)(Math.random() * 10000)); // auto-generate new number
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void display() {
        System.out.println(title);
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println(content);
        System.out.println(footer);
        System.out.println();
    }

    @Override
    public void setContent(String content) { this.content = content; }

    @Override
    public void setTitle(String title) { this.title = title; }

    public void setInvoiceNumber(String number) { this.invoiceNumber = number; }
}
