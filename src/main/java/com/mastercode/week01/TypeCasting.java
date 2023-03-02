package com.mastercode.week01;

public class TypeCasting {

    public static void main(String[] args) {

        int firstNum = 128 + 128 + 123;

        // -128 --- 127
        byte secondNum = (byte) firstNum;

        System.out.println("Second Number = " + secondNum);

        byte thirdNumber = 12;
        int forthNumber = thirdNumber;

        System.out.println("Forth Number: " + forthNumber);
    }
}
