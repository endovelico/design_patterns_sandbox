package com.dp.sandobx.non_gof;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DefensiveCopySandbox {

    // Unsafe: exposed mutable reference
    private List<String> hobbies;

    // Safe: defensive copy
    private Date birthDate;

    // Constructor
    public DefensiveCopySandbox(List<String> hobbies, Date birthDate) {
        // Unsafe: stores the reference directly
        this.hobbies = hobbies;

        // Defensive copy: protects internal mutable object
        this.birthDate = new Date(birthDate.getTime());
    }

    // Unsafe getter: returns internal list reference
    public List<String> getHobbies() {
        return hobbies; // caller can modify this!
    }

    // Safe getter: returns a copy
    public Date getBirthDate() {
        return new Date(birthDate.getTime());
    }

    // Unsafe setter: modifies internal list directly
    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    // Safe setter: makes a defensive copy
    public void setBirthDate(Date birthDate) {
        this.birthDate = new Date(birthDate.getTime());
    }

    public static void main(String[] args) {
        // Original objects
        List<String> myHobbies = new ArrayList<>();
        myHobbies.add("Reading");
        Date myBirthDate = new Date();

        // Create Person
        DefensiveCopySandbox p = new DefensiveCopySandbox(myHobbies, myBirthDate);

        // Try to modify the original objects
        myHobbies.add("Skydiving");
        myBirthDate.setTime(0);

        // See effect on Person
        System.out.println("Hobbies inside person: " + p.getHobbies());
        System.out.println("BirthDate inside person: " + p.getBirthDate());

        // Try to modify returned objects
        p.getHobbies().add("Hacking"); // modifies internal state (unsafe!)
        p.getBirthDate().setTime(999999); // does NOT affect internal birthDate (safe)

        System.out.println("After external modification attempt:");
        System.out.println("Hobbies inside person: " + p.getHobbies());
        System.out.println("BirthDate inside person: " + p.getBirthDate());
    }
}

