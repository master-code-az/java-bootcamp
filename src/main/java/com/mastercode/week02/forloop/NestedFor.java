package com.mastercode.week02.forloop;

public class NestedFor {

    //ic-ice for

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + " j=" + j);
            }
            System.out.println();
        }
    }
}
