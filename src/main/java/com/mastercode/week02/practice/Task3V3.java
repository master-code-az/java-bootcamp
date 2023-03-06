package com.mastercode.week02.practice;

import java.util.Scanner;

public class Task3V3 {

    // SOLID
    // Single Responsibility Principle
    public static void main(String[] args) {
        // 124 -> 1 + 4 = 5

        int num = 0;

        try (Scanner scanner = new Scanner(System.in)){
            num = scanner.nextInt();
        }

        int sum = firstAndLastDigitSum(num);
        System.out.println("Sum: " + sum);
    }


    static int firstAndLastDigitSum(int number) {
        int lastDigit = number % 10;
        int firstDigit = getFirstDigit(number);

        return lastDigit + firstDigit;
    }

    static int getFirstDigit(int number) {
        while (number >= 10) {
            number = number / 10;
        }

        return number;
    }
}
