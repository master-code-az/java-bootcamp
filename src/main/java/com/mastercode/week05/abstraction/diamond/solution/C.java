package com.mastercode.week05.abstraction.diamond.solution;

public interface C extends A {
  default void a() {
    System.out.println("B");
  }
}
