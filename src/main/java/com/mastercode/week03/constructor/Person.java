package com.mastercode.week03.constructor;

public class Person {

    public String name;
    public int age;
    public String gender;

    public Person(){
        System.out.println("Person Default Constructor called");
    }

//    public Person(String personName) {
//        name = personName;
//    }


    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person [" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", gender: '" + gender + '\'' +
                ']';
    }
}
