package Karolina;

import java.util.Scanner;

public class Obliczenia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Podaj liczbę a: ");
        a = scanner.nextInt();

        System.out.println("Podaj liczbę b: ");
        b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(Math.pow((a + b),2));
        System.out.println(Math.sqrt((a + b)));
        if(a > b) {
            System.out.println("Większa jest: " + a);
        }
        else {
            System.out.println("Większa jest: " + b);
        }
        if(a == b) {
            System.out.println("żadna nie jest większa hehe");
        }

    }
}
