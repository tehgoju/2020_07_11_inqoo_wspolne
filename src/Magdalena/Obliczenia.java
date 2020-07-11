package Magdalena;

import java.util.Scanner;

public class Obliczenia {
    public static void main(String[] args){
        int a, b;

        Scanner zadanie1 = new Scanner(System.in);

        System.out.println("Podaj liczbę a: ");
        a = zadanie1.nextInt();

        System.out.println("Podaj liczbę b: ");
        b = zadanie1.nextInt();

        int suma = a+b;
        System.out.println("suma= " +suma);

        /*int sumak = suma*suma;
        System.out.println("sumak= " +sumak);*/

        int potega = (int)Math.pow(suma, 2);
        System.out.println(a+" podniesione do potęgi "+2+" wynosi:\2"+potega);

      /*  double pi = Math.PI;
        System.out.println("Pierwiastek drugiego stopnia z pi wynosi:\2" + Math.sqrt(pi));*/

        /*Scanner zadanie2 = new Scanner(System.zadanie2);
        double suma = zadanie2.nextDouble();*/
        double sqrtLiczby = Math.sqrt(suma);
        System.out.println("Pierwiastek drugiego stopnia z "+ suma + " wynosi " + sqrtLiczby);

        if (a>b);
        System.out.println(a);
        if (b>a);
        System.out.println(b);


    }
}
