package com.mastercode.week04.polimorphisim;

public class Appv2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.setName("Cat 111");
        dog.setName("Dog 111");

        printName(cat);
        printName(dog);

        cat.makeSound();

    }


    public static void printName(Cat cat) {
        System.out.println(cat.getName());
    }

    public static void printName(Dog dog) {
        System.out.println(dog.getName());
    }


}
