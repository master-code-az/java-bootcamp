package com.mastercode.week01;

public class Operators {
    public static void main(String[] args) {
        // a, b, c -> ucbucagi terefleri

        int a = 10;
        int b = 20;
        int c = 30;

        int p = a + b + c;

        System.out.println("Ucbucagin perimetri = " + p);

        //  x -> kvadratin terefi

        int x = 5;
        int s1 = x * x;
        int s2 = (int) Math.pow(x, 2);

        System.out.println("Kvadratin Terefi: " + s1);
        System.out.println("Kvadratin Terefi: " + s2);


        int firstNum = 101;
        int secondNum = 10;

        int intResult = firstNum / secondNum;
        System.out.println("Int Result = " + intResult);

        int intQaliq = firstNum % secondNum;
        System.out.println("Int Qaliq = " + intQaliq);

        double doubleNumber = 1.123;
        float floatNumber = 4.123f;

        System.out.println("doubleNumber = " + doubleNumber);
        System.out.println("floatNumber = " + floatNumber);


        double resultDouble = (double) firstNum / (double) secondNum;
        System.out.println("resultDouble = " + resultDouble);


        int firstN = 10;
        firstN = firstN - 3;
        System.out.println("First N = " + firstN);

        firstN += 3; //firstN = firstN + 3;
        System.out.println("firstN += 3 = " + firstN);

        // firstN  = firstN + 1;
        // firstN += firstN;
        firstN++;
        System.out.println("firstN++ = " + firstN);


        System.out.println("12 == 12 ? " + (12 == 12));
        System.out.println("12 == 11 ? " + (12 == 11));

        System.out.println(1 + 1);

        System.out.println("1" + 1 + 1);
        System.out.println(1 + 1 + "1");

        System.out.println("1 + 1 = " + 1 + 1);
        System.out.println("1 + 1 = " + (1 + 1));

        System.out.println("1 != 2 " + (1 != 2));

        System.out.println("true = " + true);
        System.out.println("!true = " + !true);


        System.out.println(10 < 11);
        System.out.println(11 > 6);
        System.out.println(100 >= 21);
        System.out.println(100 <= 21);
        System.out.println(100 == 21);
        System.out.println(100 != 21);



    }
}
