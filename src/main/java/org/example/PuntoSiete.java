package org.example;

import java.util.Scanner;

public class PuntoSiete {
    public static void main(String[] args) {

        // Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
    }
}
