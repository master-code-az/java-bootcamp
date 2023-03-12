package com.mastercode.week03.objectandclass;

public class TestV3 {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name);
        person.name = "Ali";
        System.out.println(person.name);
    }
}
