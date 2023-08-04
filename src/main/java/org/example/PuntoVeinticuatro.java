package org.example;

import java.util.Scanner;

public class PuntoVeinticuatro {
    public static void main(String[] args) {

        // Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra

        Scanner sc = new Scanner(System.in);

        String texto;
        String letra;
        String reemplazo;
        System.out.print("Ingrese un texto: ");
        texto = sc.nextLine();
        System.out.print("Ingrese la letra a reemplazar: ");
        letra = sc.next();
        System.out.print("Ingrese la letra nueva: ");
        reemplazo = sc.next();

        for (int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) == letra.charAt(0)){
                texto = texto.replace(texto.charAt(i), reemplazo.charAt(0));
            }
        }

        System.out.println(texto);
    }
}
