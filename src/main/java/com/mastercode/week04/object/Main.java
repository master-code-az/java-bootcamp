package com.mastercode.week04.object;

public class Main {
    public static void main(String[] args) {
//        Test test = new Test();
//        test.name = "This is a test";
//        test.hashCode();
//        test.equals("");
//        test.wait();

//        System.out.println(test.getClass());
//        System.out.println(test.getClass().getName());
//        System.out.println(test);


        // == and and equals()
        int a = 5;
        int b = 5;

        System.out.println("a == b         " + (a == b));
//        System.out.println(a.equals(b)); error

        Test test1 = new Test("Ali"); // 11
        Test test2 = new Test("Ali"); // 22


        Test test3 = test1; // 11
        // Person person3 = person2;

        System.out.println("-------------------------------------");
        System.out.println("test1 == test2 " + (test1 == test2));
        System.out.println("test2 == test3 " + (test2 == test3));
        System.out.println("test1 == test3 " + (test1 == test3));
        System.out.println("-------------------------------------");
//        System.out.println("test1.isEqualTo(test2) " + test1.isEqualTo(test2));

        System.out.println("test1.equals(test2) " + test1.equals(test2));
    }
}
