package com.dp.sandobx.structural.composite;


// ===== Step 2: Leaf =====
class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showStructure(String indent) {
        System.out.println(indent + "- File: " + name);
    }
}