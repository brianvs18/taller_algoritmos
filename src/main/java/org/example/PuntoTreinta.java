package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PuntoTreinta {
    public static void main(String[] args) {

        // Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo.
        String[] palabras = {"nombre", "apellido", "edad", "nombre", "edad"};
        List<String> lista = Arrays.stream(palabras).distinct().collect(Collectors.toList());
        System.out.println("Lista sin duplicados: " + lista);
    }
}