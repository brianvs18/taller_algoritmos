package org.example;

import java.util.Scanner;

public class PuntoUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división.

        int num1;
        int num2;
        int suma;
        int resta;
        int multiplicacion;
        float division;

        System.out.print("Ingrese el primer numero entero: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        num2 = sc.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (float)num1 / (float)num2;

        System.out.println("** RESULTADOS **");
        System.out.println("Suma: " + suma + "\n" + "Resta: " + resta + "\n" + "Multiplicacion: " + multiplicacion +
                "\n" + "Division: " + division);

    }
}
