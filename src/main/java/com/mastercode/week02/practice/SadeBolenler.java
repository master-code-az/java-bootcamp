package com.mastercode.week02.practice;

import java.util.Scanner;

public class SadeBolenler {

    public static void main(String[] args) {
        // 100 -> 1, 2, 4, 5, ..., 100

        int number = 0;

        try (Scanner scanner = new Scanner(System.in)){
            number = scanner.nextInt();
        }

        sadeEdedleriCapEt(number);
    }

    private static void sadeEdedleriCapEt(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

}
