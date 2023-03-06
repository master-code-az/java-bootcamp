package com.mastercode.week02.practice;

import java.util.Scanner;

public class Task3V2 {

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
        int firstDigit = number;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        int sum = lastDigit + firstDigit;
        return sum;
    }
}