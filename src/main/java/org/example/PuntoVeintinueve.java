package org.example;

import java.util.Arrays;

public class PuntoVeintinueve {
    public static void main(String[] args) {

        // Encontrar el número más grande: Crea un programa que encuentre el número más grande en un arreglo de enteros.

        int[] numeros = {2, 5, 6, 7, 9, 11, 34, 44};
        int mayor = Arrays.stream(numeros).max().getAsInt();
        System.out.println("Numero mayor: " + mayor);
    }
}
