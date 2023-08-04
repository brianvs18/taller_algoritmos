package org.example;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PuntoVeintitres {

    public static void main(String[] args) {

        // Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene

        Scanner sc = new Scanner(System.in);

        String texto;
        int contador = 1;
        StringTokenizer contar;
        System.out.print("Ingrese un texto: ");
        texto = sc.nextLine();
        contar = new StringTokenizer(texto);
        System.out.println("Cantidad de palabras: " + contar.countTokens());

        texto = texto.trim();

        for (int i = 0; i < texto.length(); i++){
            if((texto.charAt(i) == ' ') && (texto.charAt(i+1) != ' ')){
                contador++;
            }
        }
        System.out.println("Cantidad de palabras dos: " + contador);

    }
}
