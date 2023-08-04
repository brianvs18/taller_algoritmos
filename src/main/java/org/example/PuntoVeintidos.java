package org.example;

import java.util.Scanner;

public class PuntoVeintidos {
    public static void main(String[] args) {

        // Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo
        // (se lee igual de izquierda a derecha que de derecha a izquierda)

        Scanner sc = new Scanner(System.in);

        String texto;
        String invertido = "";
        int igual = 0;

        System.out.print("Ingrese un texto: ");
        texto = sc.nextLine();

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        texto = texto.replace(" ", "");
        invertido = invertido.replace(" ", "");

        String resultado = (texto.equalsIgnoreCase(invertido)) ? "Es polindromo" : "No es polindromo";
        System.out.println(resultado);


    }
}
