package com.mastercode.week02;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        int num = 0;

        try (Scanner scanner = new Scanner(System.in)){
            num = scanner.nextInt();
        }

//        switch (num) {
//            case 1 -> System.out.println("Bir");
//            case 2 -> System.out.println("Iki");
//            case 3 -> System.out.println("Uc");
//            default -> System.out.println("Zehmet olmasa 1 ve 3 araliginde eded daxil edin");
//        }


        switch (num) {
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            default:
                System.out.println("Zehmet olmasa 1 ve 3 araliginde eded daxil edin");
        }

        //        if (num == 1) {
//            System.out.println("Bir");
//        } else if (num == 2) {
//            System.out.println("Iki");
//        } else if (num == 3) {
//            System.out.println("Uc");
//        } else {
//            System.out.println("Zehmet olmasa 1 ve 3 araliginde eded daxil edin");
//        }
    }
}
