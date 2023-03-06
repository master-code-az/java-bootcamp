package com.mastercode.week02.practice;

import java.util.Scanner;

public class Task3V6 {

    // SOLID
    // Single Responsibility Principle
    public static void main(String[] args) {
        // 124 -> 1 + 4 = 5

        int num = 0;

        try (Scanner scanner = new Scanner(System.in)){
            num = scanner.nextInt();
        }

        print(num);
    }

    static void print(int number) {
        System.out.println(firstAndLastDigitSum(number));
    }

    static int firstAndLastDigitSum(int number) {
        return getLastDigit(number) + getFirstDigit(number);
    }

    static int getLastDigit(int number) {
        return number % 10;
    }

    static int getFirstDigit(int number) {
        while (number >= 10) {
            number = number / 10;
        }

        return number;
    }
}
