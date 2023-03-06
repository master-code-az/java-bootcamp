package com.mastercode.week02.forloop;

import java.util.Scanner;

public class PasswordHacking {

    public static void main(String[] args) {
        int password = 0;
        try (Scanner scanner = new Scanner(System.in)){
             password = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Zehemet olmasa tam eded daxil edin");
        }

        System.out.println(password);
    }

    // 0000
    // 0001
    // 0002
    // ....
    // 9999

    static int findPassword(int password) {

        for (int i = 0; i <= 9999; i++) {
            if (password == i) return i;
        }

        return -1;
    }

}
