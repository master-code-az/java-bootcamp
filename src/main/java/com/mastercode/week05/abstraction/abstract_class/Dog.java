package com.mastercode.week05.abstraction.abstract_class;

public class Dog extends Animal {

  public Dog(String type, String size, Double weight) {
    super(type, size, weight);
  }

  @Override
  public void move(String speed) {
    if ("slow".equals(speed)) {
      System.out.println(type + " walking");
    } else {
      System.out.println(type + " running");
    }
  }

  @Override
  public void makeSound() {
    if (type.equals("Wolf")) {
      System.out.println("Howling");
    } else {
      System.out.println("Barking");
    }
  }
}
