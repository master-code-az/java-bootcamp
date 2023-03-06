package com.mastercode.week02.forloop;

import java.util.Scanner;

public class VurmaCedveliV2 {

    public static void main(String[] args) {

        int start;
        int end;

        try (Scanner scanner = new Scanner(System.in)){
            start = scanner.nextInt();
            end = scanner.nextInt();
        }

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }

    }

}
