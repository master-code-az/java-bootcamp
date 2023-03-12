package com.mastercode.week03.objectandclass;

public class Person {

//     `[access_modifier] [static] [final] type name [= initial value] ;`

    public static String test = "This is a test";

    public final int ayaqSayi = 2;

    public String name;
    public int age;
    public String gender;

    public void walk() {
        System.out.println("Walking");
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    public void work() {
        System.out.println("Working");
    }

    public void printPersonInfo() {
        System.out.println(
                "name: " + name
                        + " age: " + age
                        + " gender: " + gender
        );
    }


    public static void testMethod() {
        System.out.println("This is a test method");
    }
}
