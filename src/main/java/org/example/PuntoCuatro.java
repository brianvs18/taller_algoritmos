package org.example;

import java.util.Scanner;

public class PuntoCuatro {
    public static void main(String[] args) {

        // Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.

        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        String resultado = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
        System.out.println(resultado);

    }
}
