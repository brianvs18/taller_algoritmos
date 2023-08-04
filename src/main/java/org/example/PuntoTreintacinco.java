package org.example;

import java.util.Arrays;

public class PuntoTreintacinco {
    public static void main(String[] args) {

        // Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar del 1 al  10. Usa para esto una matriz

        int[] matriz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // FUNCIONAL
        Arrays.stream(matriz)
                .forEach(numero -> Arrays.stream(matriz)
                        .mapToObj(multiplo -> numero + " x " + multiplo + " = " + (numero * multiplo))
                        .forEach(System.out::println));

        // IMPERATIVA
        for (int numero : matriz) {
            System.out.println("** Tabla del " + numero + " **");
            for (int multiplo : matriz) {
                int resultado = numero * multiplo;
                System.out.println(numero + " x " + multiplo + " = " + resultado);
            }
        }
    }
}
