package com.mastercode.week03.constructor;

public class PersonV2 {

    public String name;
    public int age;
    public String gender;

    public PersonV2(){
        System.out.println("Person Default Constructor called");
    }


    public PersonV2(String name) {
        this.name = name;
    }

    public PersonV2(String name, int age) {
        this(name);
        this.age = age;
    }

    public PersonV2(String name, int age, String gender) {
        this(name, age);
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
