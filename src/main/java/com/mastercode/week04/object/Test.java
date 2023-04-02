package com.mastercode.week04.object;

import java.util.Objects;

public class Test {
    public String name;
    public int age;

    public Test(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

//    public boolean isEqualTo(Test test) {
//        return name.equals(test.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test test)) return false;
        return age == test.age && Objects.equals(name, test.name);
    }

}
