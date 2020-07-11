package Lukasz;




import java.util.Scanner;

public class Obliczenia {
    public static void main(String[] args) {
        int a, b;

        Scanner podajLiczbe = new Scanner(System.in);


        System.out.println("Podaj liczbę a: ");
        a = podajLiczbe.nextInt();

        System.out.println("Podaj liczbę b: ");
        b = podajLiczbe.nextInt();
        int s = 2;
        int suma = a + b;
        double potega = Math.pow(suma, s);
        double pierwiastek = Math.sqrt(suma);

        System.out.println("Podaj liczbe: " + a);
        System.out.println("Podaj liczbe:" + b);
        System.out.println("Suma: " + suma);
        System.out.println("Potega: " + potega);
        System.out.println("Pierwiastek: " + pierwiastek);

        if (a>b)
            System.out.println("wieksza liczba to a:" + a);
        else
            System.out.println("Wieksza liczba to b: " + b);





    }
}
