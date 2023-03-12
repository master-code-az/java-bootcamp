package com.mastercode.week03.objectandclass;

public class TestV4 {
    public static void main(String[] args) {
        Person ali = new Person();
        ali.name = "Ali";
        ali.age = 17;
        ali.gender = "male";
        ali.printPersonInfo();

        Person vali = new Person();
        vali.name = "Vali";
        vali.age = 21;
        vali.gender = "male";
        vali.printPersonInfo();

        Person aysu = new Person();
        aysu.name = "Aysu";
        aysu.age = 18;
        aysu.gender = "female";
        aysu.printPersonInfo();

        System.out.println(vali.ayaqSayi);
    }
}
