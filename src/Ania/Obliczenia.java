package Ania;

import java.util.Scanner;

public class Obliczenia {
    public static void main(String[] args) {
        double a, b, suma, potega, pierwiastek, n;

        Scanner zadanie = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        a = zadanie.nextDouble();

        System.out.println("Podaj liczbę b:");
        b = zadanie.nextDouble();

        suma = a + b;
        System.out.println("Suma = " + suma);

//       n = 2;
//        potega = Math.pow(double a, double n);
//        System.out.println("Potęga sumy = " + potega);


        pierwiastek = Math.sqrt(suma);
        System.out.println("Pierwiastek sumy = " + pierwiastek);
    }


}
