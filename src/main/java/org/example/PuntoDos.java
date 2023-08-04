package org.example;

import java.util.Scanner;

public class PuntoDos {
    public static void main(String[] args) {

        // Escribe un programa que pida al usuario un número entero y determine si es par o impar.

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero entero: ");
        numero = sc.nextInt();

        String resultado = (numero % 2 == 0) ? "El numero " + numero + " es par" : "El numero " + numero + " es impar";

        System.out.println(resultado);

    }
}
