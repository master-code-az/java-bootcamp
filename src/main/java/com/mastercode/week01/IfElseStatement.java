package com.mastercode.week01;

public class IfElseStatement {
    public static void main(String[] args) {
        boolean isOnline = true;

        if(isOnline == true) {
            System.out.println("We are online !!!");
        } else {
            System.out.println("We are not online !!!");
        }

        String result =  isOnline == true ? "We are online !!!" : "We are not online !!!";

        System.out.println(result);

        int numberOfMonth = 88;

        if (numberOfMonth == 1) {
            System.out.println("January");
        } else if (numberOfMonth == 2) {
            System.out.println("February");
        } else if (numberOfMonth == 3) {
            System.out.println("March");
        } else if (numberOfMonth == 4) {
            System.out.println("April");
        } else if (numberOfMonth == 5) {
            System.out.println("May");
        } else if (numberOfMonth == 6) {
            System.out.println("June");
        }  else if (numberOfMonth == 7) {
            System.out.println("July");
        } else if (numberOfMonth == 8) {
            System.out.println("August");
        } else if (numberOfMonth == 9) {
            System.out.println("September");
        } else if (numberOfMonth == 10) {
            System.out.println("October");
        } else if (numberOfMonth == 11) {
            System.out.println("November");
        } else if (numberOfMonth == 12) {
            System.out.println("December");
        } else {
            System.out.println("Incorrect Number");
        }


    }
}
