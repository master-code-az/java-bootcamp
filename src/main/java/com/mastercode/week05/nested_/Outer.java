package com.mastercode.week05.nested_;

public class Outer {
  private int x = 11;

  static class Nested {
    public void printX() {
      Outer outer = new Outer();
      System.out.println(outer.x);
    }
  }


  public static void main(String[] args) {
    Nested nested = new Nested();
    nested.printX();
  }
}
