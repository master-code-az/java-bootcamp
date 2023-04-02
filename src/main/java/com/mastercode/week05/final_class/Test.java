package com.mastercode.week05.final_class;

public class Test {

  public static void main(String[] args) {
    int add = MathUtils.add(1, 3);
    System.out.println(add);

    int multiply = MathUtils.multiply(1, 2);
    System.out.println(multiply);

    MathUtils mathUtils = new MathUtils();
    mathUtils.test(1);
  }

}
