package com.inqoo.basics.Jacek;

import com.ibm.gpu.Maths;

import java.util.Scanner;

public class Obliczenia {
    public static void main(String[] args) {
        int a, b;
        Scanner liczydlo = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        a = liczydlo.nextInt();

        System.out.println("Podaj liczbę b: ");
        b = liczydlo.nextInt();

        int suma = a + b;

        double potega = Math.pow(suma, 2) ;

        double pierwiastek = Math.sqrt(suma);

        System.out.println("Suma równa się: " + suma);
        System.out.println("Potęga równa się: " + potega);
        System.out.println("Pierwiastek równa się: " + pierwiastek);




    }

}
