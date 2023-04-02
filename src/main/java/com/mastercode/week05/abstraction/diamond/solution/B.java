package com.mastercode.week05.abstraction.diamond.solution;

public interface B extends A {
  default void a() {
    System.out.println("B");
  }
}
