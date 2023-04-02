package com.mastercode.week05.abstraction.abstract_class;

public class Main {

  public static void main(String[] args) {
//    Animal animal = new Animal("wolf", "big", 100.0)

    Dog dog = new Dog("wolf", "big", 100.0);
    dog.move("slow");
    dog.makeSound();
    dog.printType();
  }

}
