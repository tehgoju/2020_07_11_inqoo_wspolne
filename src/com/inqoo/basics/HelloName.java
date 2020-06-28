package com.inqoo.basics;

import java.util.Scanner;

public class HelloName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię: ");

        String name = scanner.next();

        System.out.println("Hej " + name + "!");
    }
}
