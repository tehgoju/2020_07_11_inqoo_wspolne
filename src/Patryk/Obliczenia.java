package Patryk;

import java.util.Scanner;

public class Obliczenia {

    public static void main(String[] args) {
    int a;
    int b;

    Scanner liczydło = new Scanner(System.in);

    System.out.println("podaj liczbę a: ");
    a = liczydło.nextInt();

    System.out.println("podaj liczbę b: ");
    b = liczydło.nextInt();

    int suma = a + b;

    System.out.println("suma = " + suma);

}


}
