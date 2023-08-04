package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class PuntoVeintiocho {
    public static void main(String[] args) {

        // Suma de elementos: Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros.
        int[] elements = {2, 3, 7, 3, 9, 11};
        int suma = Arrays.stream(elements).sum();
        System.out.println("Resultado: " + suma);
    }
}
