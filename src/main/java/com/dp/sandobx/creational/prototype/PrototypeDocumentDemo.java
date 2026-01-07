package com.dp.sandobx.creational.prototype;


// ===== Step 3: Client Code =====
public class PrototypeDocumentDemo {
    public static void main(String[] args) {
        // Predefined prototypes (templates)
        Document reportTemplate = new Report();
        Document invoiceTemplate = new Invoice();

        // Clone documents from templates
        Document report1 = reportTemplate.clone();
        report1.setTitle("Q1 Financial Report");
        report1.setContent("Profit: $100,000\nExpenses: $60,000");

        Document report2 = reportTemplate.clone();
        report2.setTitle("Q2 Financial Report");
        report2.setContent("Profit: $150,000\nExpenses: $90,000");

        Document invoice1 = invoiceTemplate.clone();
        invoice1.setTitle("Client Invoice");
        invoice1.setContent("Item A: $50\nItem B: $30");

        Document invoice2 = invoiceTemplate.clone();
        invoice2.setTitle("Client Invoice");
        invoice2.setContent("Item C: $100\nItem D: $200");

        // Display all documents
        report1.display();
        report2.display();
        invoice1.display();
        invoice2.display();
    }
}