package com.mastercode.week04.polimorphisim;

public class Dog extends Animal {



    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }

    @Override
    public void makeSound() {
        System.out.println("The dog 🐶 barks");
    }
}
