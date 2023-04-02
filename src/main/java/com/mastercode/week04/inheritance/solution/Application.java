package com.mastercode.week04.inheritance.solution;

public class Application {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.learn();
        programmer.name = "Ali";
        programmer.age = 19;

        System.out.println(programmer.name);
        System.out.println(programmer.age);


        programmer.code();
        programmer.companyName = "Google Inc";


        Singer singer = new Singer();
        singer.age = 21;

    }
}
