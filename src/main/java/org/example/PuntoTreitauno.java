package org.example;

import java.util.Arrays;

public class PuntoTreitauno {
    public static void main(String[] args) {

        // Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo, el algoritmo de burbuja o el de selección)
        // para ordenar un arreglo de enteros de manera ascendente.

        int[] numeros = {1, 4, 2, 7, 9, 3, 8, 6};
        Arrays.sort(numeros);
        System.out.println("Ascendente");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        Arrays.stream(numeros).forEach(System.out::print);
    }
}
