package com.mastercode.week03.constructor;

public class Test {
    public static void main(String[] args) {
        Person ali = new Person("Ali", 18, "male");
        Person vali = new Person("Vali", 18, "male");
        Person aysu = new Person("Aysu", 18, "female");

        System.out.println(ali);
        System.out.println(vali);
        System.out.println(aysu);

        Person alice = new Person("Alice");
        System.out.println(alice);

        Person bob = new Person("Bob", 34);
        System.out.println(bob);


        Person person = new Person();
    }
}
