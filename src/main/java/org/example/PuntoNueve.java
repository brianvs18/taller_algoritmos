package org.example;

import java.util.Scanner;

public class PuntoNueve {
    public static void main(String[] args) {

        //Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.

        Scanner sc = new Scanner(System.in);
        int numero;
        float factorial = 1;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++){
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
