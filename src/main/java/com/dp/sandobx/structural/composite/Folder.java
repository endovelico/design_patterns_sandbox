package com.dp.sandobx.structural.composite;


import java.util.ArrayList;
import java.util.List;

// ===== Step 3: Composite =====
class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void showStructure(String indent) {
        System.out.println(indent + "+ Folder: " + name);
        for (FileSystemComponent component : children) {
            component.showStructure(indent + "   ");
        }
    }
}
