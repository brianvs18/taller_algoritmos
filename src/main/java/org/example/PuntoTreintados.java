package org.example;

import java.util.stream.IntStream;

public class PuntoTreintados {
    public static void main(String[] args) {

        // Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y muestre su índice (o un mensaje si no se encuentra).

        int[] numeros = {1, 3, 4, 8, 3, 9, 12, 7};
        int numero = 3;
        int values = IntStream.range(0, numeros.length)
                .filter(value -> numero == numeros[value])
                .findFirst()
                .orElse(-1);
        String resultado = (values != -1) ? "El numero se encuentra en la posicion: " + (values + 1) : "No existe";
        System.out.println(resultado);
    }
}
