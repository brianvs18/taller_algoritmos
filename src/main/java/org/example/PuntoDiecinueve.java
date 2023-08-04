package org.example;

import java.util.Scanner;

public class PuntoDiecinueve {
    public static void main(String[] args) {

        // Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas

        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.print("Ingrese su nombre: ");
        nombre = sc.next();
        System.out.println("Mayusculas: " + nombre.toUpperCase());
        System.out.println("Minusculas: " + nombre.toLowerCase());

    }
}
