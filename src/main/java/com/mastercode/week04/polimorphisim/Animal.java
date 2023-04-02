package com.mastercode.week04.polimorphisim;

public class Animal {

    private String name;
    private String location;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public void makeSound() {
        System.out.println("The animal make sound");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return name;
    }
}
