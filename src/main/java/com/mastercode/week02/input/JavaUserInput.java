package com.mastercode.week02.input;

import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adiniz nedir? ");
        String name = scanner.nextLine();

        System.out.println("Ad: " + name);


        try {
            System.out.print("Yasiniz necedir? ");
            int age = scanner.nextInt();

            System.out.println("Yas: " + age);
        } catch (Exception e) {
            System.out.println("Zehemet olmasa tam eded daxil edin");
        }

        scanner.close();

//        int age = 0;
//
//        try {
//             age = scanner.nextInt();
//        } catch (Exception e) {
//            System.out.println("Zehemet olmasa tam eded daxil edin");
//        }
//
//        System.out.println("Yas: " + age);

    }
}
