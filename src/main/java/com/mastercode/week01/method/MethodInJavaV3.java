package com.mastercode.week01.method;

// Ctr + ALT + L -> kodu seliqeye salir
public class MethodInJavaV3 {
    public static void main(String[] args) {
        int netice = birEdediniQaytar();
        System.out.println("Netice: " + netice);


//        int ikiEdedinCemi = cem(10, 20);
//        System.out.println(ikiEdedinCemi);

        int birinciEded = 10;
        int ikinciEded = 20;

        int ikiEdedinCemi = cem(birinciEded, ikinciEded);
        System.out.println(birinciEded + " + " + ikinciEded + " = " + ikiEdedinCemi);
    }

    public static int birEdediniQaytar() { // 1i qaytaracaq
        return 1;
    }

    public static int cem(int a, int b) {
        return a + b;
    }


}
