package com.mastercode.week02.input;

import java.util.Scanner;

public class JavaUserInputV2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Adiniz nedir? ");
            String name = scanner.nextLine();

            System.out.print("Yasiniz necedir? ");
            int age = scanner.nextInt();

            System.out.println("Ad: " + name);
            System.out.println("Yas: " + age);
        } catch (Exception e) {
            System.out.println("Zehemet olmasa tam eded daxil edin");
        }

    }
}
