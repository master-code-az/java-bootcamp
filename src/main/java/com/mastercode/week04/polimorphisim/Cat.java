package com.mastercode.week04.polimorphisim;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    @Override
    public void makeSound() {
        System.out.println("The cat 😺 meows");
    }

    public void test() {

    }

}
