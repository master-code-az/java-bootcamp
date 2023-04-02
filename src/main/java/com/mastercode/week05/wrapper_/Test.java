package com.mastercode.week05.wrapper_;

public class Test {

  public static void main(String[] args) {
    int a = 6;
    System.out.println(a);

    String aS = String.valueOf(a);

    Integer b = 10;
    System.out.println(b);

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    String string = b.toString();
    System.out.println(string);

    int num1 = 1;
    int num2 = 1;

    System.out.println(num1 == num2);

    Integer a1 = 3; // Integer.valueOf(3);
    Integer aa1 = Integer.valueOf(3);

    Integer a2 = 3;

    System.out.println(a1 == a2);

    Integer a3 = 1000;  // new Integer(1000)
    Integer a4 = 1000;
    System.out.println(a3 == a4);

    Boolean a5 = true;

    System.out.println(Boolean.TRUE);

    System.out.println(Boolean.parseBoolean("true"));
    System.out.println(Boolean.parseBoolean("TRUE"));
    System.out.println(Boolean.parseBoolean("tRuE"));
    System.out.println(Boolean.parseBoolean("test"));
    System.out.println(Boolean.parseBoolean("false"));
    System.out.println(Boolean.parseBoolean(null));



  }

}
