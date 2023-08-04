package org.example;

import java.util.Arrays;

public class PuntoTreintacuatro {
    public static void main(String[] args) {

        // Rotación de elementos: Implementa un programa que rote los elementos de un arreglo hacia
        // la izquierda o la derecha una cierta cantidad de posiciones.

        int[] numeros = {2, 4, 6, 8, 10};
        int rotacion = 3;

        System.out.println("Como empieza " + Arrays.toString(numeros));

        int tamano = numeros.length;
        int[] temporal = new int[rotacion];

        for (int i = 0; i < rotacion; i++) {
            temporal[i] = numeros[i];
        }
        System.out.println("Los que van a rotar " + Arrays.toString(temporal));

        for (int i = rotacion; i < tamano; i++) {
            numeros[i - rotacion] = numeros[i];
        }
        System.out.println("Aqui voy " + Arrays.toString(numeros));

        for (int i = 0; i < rotacion; i++){
            numeros[tamano - rotacion + 1] = temporal[i];
        }
        System.out.println("Por aqui " + Arrays.toString(numeros));

    }
}
