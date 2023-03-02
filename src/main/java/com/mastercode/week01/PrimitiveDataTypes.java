package com.mastercode.week01;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println("MAX int = " + maxInt);
        System.out.println("MIN int = " + minInt);

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        System.out.println("MAX byte = " + maxByte);
        System.out.println("MIN byte = " + minByte);

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        System.out.println("MAX float = " + maxFloat);
        System.out.println("MIN float = " + minFloat);


        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("MAX double = " + maxDouble);
        System.out.println("MIN double = " + minDouble);

        char myAChar = 'a';
        System.out.println("a = " + myAChar);


        boolean isLive = true;
        boolean isOffline = false;

        System.out.println("Is Live: " + isLive);
        System.out.println("Is Offline: " + isOffline);


        String salam = "Salam Dunya";
        System.out.println(salam);
    }
}
