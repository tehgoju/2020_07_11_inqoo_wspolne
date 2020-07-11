package Przemek;

import java.util.Scanner;


public class Obliczenia {
    public static void main(String[] args) {
        int a, b, c, d;
        float e;
        Scanner liczacz = new Scanner(System.in);


        System.out.println("Podaj liczbę a");
        a = liczacz.nextInt();
        System.out.println("Podaj liczbę b");
        b = liczacz.nextInt();
        c = a + b;
        System.out.println("suma: " + c);
        d = (int)Math.pow(c,2);
        System.out.println("Potęga: " + d );
        e = (float)Math.sqrt(c);
        System.out.println("Pierwiastek: " + e);
        if (a > b) {
            System.out.println("Większa jest liczba: a" + a );
        }
        if (a < b) {
            System.out.println("Większa jest liczba: b" + b);
        }
        if (a == b) {
            System.out.println("Liczby takie same");
        }


    }
}
