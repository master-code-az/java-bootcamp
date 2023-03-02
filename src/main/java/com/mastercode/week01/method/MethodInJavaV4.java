package com.mastercode.week01.method;

// Overloading
public class MethodInJavaV4 {
    public static void main(String[] args) {
        System.out.println("int a + b = " + cem(100, 600));
        System.out.println("double a + b = " + cem(12.5, 5.8));

        cem(1);
        cem(1.13);
        cem(1,1);
        cem(1.12,1.2);
    }

    public static int cem(int a, int b) {
        return a + b;
    }

    public static int cem(int a) {
        return a + a;
    }

    public static double cem(double a) {
        return a + a;
    }

    public static double cem(double a, double b) {
        return a + b;
    }


//    public static int cem(double a, double b) {
//        return (int) (a + b);
//    }



}
