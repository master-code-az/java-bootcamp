package com.mastercode.week02.whileloop;

import java.util.Scanner;

public class EdedinCemi {


    public static void main(String[] args) {

        int number;
        int result = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            number = scanner.nextInt();
        }

        int actualNumber = number;

        while (number != 0) {
            result = result + number; // result += number;
            number = number - 1; // number--;
        }

        System.out.println("1-den " + actualNumber + "-ye qeder ededlerin cemi = " + result);
    }

}
