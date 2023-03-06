package com.mastercode.week02.practice;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        // 11211  == 11211 ->  is palindrome
        // 11231  == 13211 ->  is not palindrome
        // 32 == 23        ->  is not palindrome
        // 11 == 11        ->  is palindrome
        // aba == aba        ->  is palindrome
        // abb == baa        ->  is palindrome

        int number = 0;

        try (Scanner scanner = new Scanner(System.in)){
            number = scanner.nextInt();
        }

        boolean isPal = isPalindrome(number);

        if (isPal) {
            System.out.println(number + " is palindrome");
        } else {
            System.out.println(number + " is not palindrome");
        }
    }

    private static boolean isPalindrome(int num) {
        int reverseNum = 0;
        int remainder = 0;
        int currentNumber = num;

        while (num != 0) {
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num = num / 10;
        }

        return currentNumber == reverseNum;
    }


}
