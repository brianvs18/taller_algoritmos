package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PuntoTreintatres {
    public static void main(String[] args) {

        // Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada elemento en un arreglo.

        int[] numeros = {1, 2, 4, 6, 3, 1, 3, 2, 1};
        Map<Integer, Long> frecuenciaMap = Arrays.stream(numeros)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frecuenciaMap.forEach((numero, frecuencia) -> System.out.println("El numero " + numero + " se repite " + frecuencia + " veces"));

    }
}
