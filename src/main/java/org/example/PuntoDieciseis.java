package org.example;

import java.util.Scanner;

public class PuntoDieciseis {
    public static void main(String[] args) {

        // Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario.

        Scanner sc = new Scanner(System.in);
        int numero;
        int num1 = 0;
        int num2 = 1;
        int suma;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.print(num1 + " ");
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }
}
