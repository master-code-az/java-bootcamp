package com.mastercode.week04.inheritance.solution_private;

public class Singer extends Person {

    private String bandName;
    
    public void sing() {
        System.out.println("Sing");
    }

    public void playGuitar() {
        System.out.println("Play Guitar");
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void eat() {
        String name = super.getName();
        System.out.println(name + " eating");
    }

    @Override
    public void learn() {
        String name = super.getName();
        System.out.println(name + " learning");
    }

    public void doMultipleThings() {
       super.learn();
       this.learn();
    }

    public void doSomething() {
        super.getName();
        super.setName("Vali");
        this.sing();
        this.playGuitar();
    }
}
