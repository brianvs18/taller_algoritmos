package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class PuntoVeintisiete {
    public static void main(String[] args) {

        // Crea un programa que solicite al usuario una frase y luego muestre las palabras ordenadas alfabéticamente

        Scanner sc = new Scanner(System.in);
        String texto;
        System.out.print("Ingrese un texto: ");
        texto = sc.nextLine();
        String[] orden = texto.split(" ");
        Arrays.sort(orden);
        for (int i = 0; i < orden.length; i++){
            System.out.print(orden[i] + " ");
        }
    }
}
