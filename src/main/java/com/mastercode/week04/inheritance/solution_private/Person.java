package com.mastercode.week04.inheritance.solution_private;

public class Person {
    private String name;
    private Integer age;


    public void walk() {
        System.out.println("walking");
    }

    public void learn() {
        System.out.println("learning");
    }

    public void eat() {
        System.out.println("eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 0) throw new IllegalArgumentException("Age must be positive");
        this.age = age;
    }
}
