package Pawel;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Obliczenia {


    public static void main(String[] args) {
        int a, b;
        System.out.println("Podaj dwie liczby a i b");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        int suma = a+b;

        System.out.println("Suma a + b = " + suma);
        System.out.println(suma + " do potęgi 2 to " + pow(suma, 2));
        System.out.println("pierwiastek z " + suma + " to " + sqrt(suma));

        System.out.println("Z podanych liczb ta" + " jest większa");

    }
}