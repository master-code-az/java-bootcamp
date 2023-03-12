package com.mastercode.week03.encapsulation;

public class Person {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Age must be positive");
        }

        this.age = age;

    }

    public void setGender(String gender) {

        if (gender == null){
            throw new IllegalArgumentException("Gender must not be null");
        }

        String currentGender = gender.toLowerCase();

        switch (currentGender) {
            case "male", "female" -> this.gender = currentGender;
            default -> throw new IllegalArgumentException("Gender must be either male or female");
        }

//        switch (currentGender) {
//            case "male" -> this.gender = "male";
//            case "female" -> this.gender = "female";
//            default -> throw new IllegalArgumentException("Gender must be either male or female");
//        }

    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }







    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
