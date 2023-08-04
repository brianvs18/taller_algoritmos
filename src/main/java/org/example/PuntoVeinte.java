package org.example;

import java.util.Scanner;

public class PuntoVeinte {
    public static void main(String[] args) {

        // Realiza un programa que solicite al usuario una cadena y luego invierta su orden

        Scanner sc = new Scanner(System.in);

        String texto;
        String invertido = "";

        System.out.print("Ingrese un texto: ");
        texto = sc.nextLine();

        for (int i = texto.length() - 1; i >= 0; i--){
            invertido += texto.charAt(i);
        }
        System.out.println(texto);
        System.out.println(invertido);

    }
}
