package com.mastercode.week01.method;

// Ctr + ALT + L -> kodu seliqeye salir
public class MethodInJavaV2 {
    public static void main(String[] args) {
//        sumV1();
//        sumV1();
//        sumV1();

//        sumV2(1, 2);
//        sumV2(11, 21);
//        sumV2(31415, 14141);
//        sumV2(12121211, 212131);

        ededinKvadrati(5);
        ededinKvadrati(10);
        ededinKvadrati(121);
    }


    public static void sumV1() {
        int firstNum = 1;
        int secondNum = 2;

        int result = firstNum + secondNum;
        System.out.println("Sum: " + result);
    }

    public static void sumV2(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + result);
    }

    public static void ededinKvadrati(int number) {
        System.out.println(number + "^" + 2 + " = " + (number * number));
    }



}
