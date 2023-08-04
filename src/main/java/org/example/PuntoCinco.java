package org.example;

import java.util.Scanner;

public class PuntoCinco {
    public static void main(String[] args) {

        // Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Ingrese un número: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese otro número: ");
        num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println("EL numero " + num1 + " es mayor");
        }
        else if(num2 > num1)
        {
            System.out.println("EL numero " + num2 + " es mayor");
        }
        else if(num1 == num2)
        {
            System.out.println("Los numeros son iguales");
        }

    }
}
