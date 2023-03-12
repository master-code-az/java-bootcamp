package com.mastercode.week03.project02;

import java.util.Scanner;

public class Player {

//    public String name;
    public int number;

    public void guess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("I am guessing...  ");

        this.number = scanner.nextInt();
    }
}
