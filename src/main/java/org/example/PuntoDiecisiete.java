package org.example;

import java.util.Scanner;

public class PuntoDiecisiete {
    public static void main(String[] args) {

        // Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango.

        Scanner sc = new Scanner(System.in);
        int numInicial;
        int numFinal;
        System.out.print("Ingrese un numero: ");
        numInicial = sc.nextInt();
        System.out.print("Ingrese un numero: ");
        numFinal = sc.nextInt();
        int contador = 0;
        for (int i = numInicial; i <= numFinal; i++) {
            if (esPrimo(i)) {
                contador++;
                System.out.print(i + " ");
            }
        }


    }

    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            } else return true;
        }
        return true;
    }
}
