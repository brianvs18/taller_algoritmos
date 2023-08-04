package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class PuntoVeinticinco {
    public static void main(String[] args) {

        // Pide al usuario una frase y muestra cada palabra por separado

        Scanner sc = new Scanner(System.in);
        String texto;
        System.out.print("Ingrese un texto: ");
        texto = sc.nextLine();
        String[] palabras = texto.split(" ");
        Arrays.stream(palabras).forEach(System.out::println);
    }
}
