package com.mastercode.week05.abstraction.abstract_class;

public abstract class Animal {

  protected String type;
  private String size;
  private Double weight;

  public Animal(String type, String size, Double weight) {
    this.type = type;
    this.size = size;
    this.weight = weight;
  }

//  public Animal() {
//  }

  public abstract void move(String speed);
  public abstract void makeSound();


  public void printType() {
    System.out.println("Type of " + type);
  }
}
