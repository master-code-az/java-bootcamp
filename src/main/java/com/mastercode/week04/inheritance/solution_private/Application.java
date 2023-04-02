package com.mastercode.week04.inheritance.solution_private;

public class Application {
    public static void main(String[] args) {
//        Programmer programmer = new Programmer();
//        programmer.learn();
//        programmer.setName("Ali");
//        programmer.setAge(19);
//
//        System.out.println(programmer.getName());
//        System.out.println(programmer.getAge());
//
//
//        programmer.code();
//        programmer.setCompanyName("Google Inc");
//
//        Singer singer = new Singer();
//        singer.setAge(21);
//        System.out.println(singer.getAge());

//        Singer singer  = new Singer();
//        singer.doMultipleThings();
//        singer.doSomething();

        Singer singer = new Singer();
        singer.setName("Ali");

        singer.learn();
        singer.doMultipleThings();

    }
}
