package com.dp.sandobx.structural.composite;

// ===== Step 4: Client =====
public class CompositePatternDemo {
    public static void main(String[] args) {
        // Leaf objects
        File file1 = new File("Resume.docx");
        File file2 = new File("Photo.png");
        File file3 = new File("Notes.txt");

        // Composite objects
        Folder documents = new Folder("Documents");
        Folder pictures = new Folder("Pictures");
        Folder home = new Folder("Home");

        // Build tree structure
        documents.addComponent(file1);
        pictures.addComponent(file2);
        home.addComponent(documents);
        home.addComponent(pictures);
        home.addComponent(file3); // File directly under Home

        // Display full structure
        home.showStructure("");
    }
}