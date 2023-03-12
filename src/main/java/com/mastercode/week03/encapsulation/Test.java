package com.mastercode.week03.encapsulation;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(10);
        person.setName("John");
        person.setGender("FeMaLe");

        int age = person.getAge();
        String name = person.getName();
        String gender = person.getGender();

        System.out.println("age: " + age);
        System.out.println("name: " + name);
        System.out.println("gender: " + gender);
    }
}
