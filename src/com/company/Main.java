package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // parasyti programa, kuri paprasytu vesti skaicius tol, kol bus ivestas skaicius 0.
        // Pabaigoje turi buti atvaizduojama skaiciu suma
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        int skaicius = sc.nextInt();
        int suma = 0;
        while (skaicius != 0) {
            System.out.println("Iveskite skaiciu: ");
            skaicius = sc.nextInt();
            suma += skaicius;
        }
        System.out.println("Ivestu skaiciu suma: " + suma);
    }
}
