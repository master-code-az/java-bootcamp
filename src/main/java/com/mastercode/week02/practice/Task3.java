package com.mastercode.week02.practice;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        // 124 -> 1 + 4 = 5

        int num = 0;

        try (Scanner scanner = new Scanner(System.in)){
            num = scanner.nextInt();
        }

        int lastDigit = num % 10;
        int firstDigit = num;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        int sum = lastDigit + firstDigit;

        System.out.println("Sum: " + sum);
    }
}
