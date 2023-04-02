package com.mastercode.week04.polimorphisim;

public class AppV3 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.setName("Cat 111");
        dog.setName("Dog 111");

        printName(cat);
        printName(dog);

        cat.test();
    }

    public static void printName(Animal animal) {
        System.out.println(animal.getName());
    }

}
