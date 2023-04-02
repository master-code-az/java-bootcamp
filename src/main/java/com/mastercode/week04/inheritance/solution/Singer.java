package com.mastercode.week04.inheritance.solution;

public class Singer extends Person {

    private String bandName;
    
    public void sing() {
        System.out.println("Sing");
    }

    public void playGuitar() {
        System.out.println("Play Guitar");
    }
}
