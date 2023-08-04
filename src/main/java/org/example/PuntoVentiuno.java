package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class PuntoVentiuno {
    public static void main(String[] args) {

        // Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella

        Scanner sc = new Scanner(System.in);

        String texto;
        String letra;
        int contador = 0;

        System.out.print("Ingrese un texto: ");
        texto = sc.nextLine();
        System.out.print("Ingrese la letra contar: ");
        letra = sc.next();

        ArrayList<String> list = new ArrayList<>();
        texto = texto.replace(" ", "");
        for (int i = 0; i < texto.length(); i++){
            list.add(String.valueOf(texto.charAt(i)));
        }

        for (String caracter : list) {
            if(caracter.equalsIgnoreCase(letra)){
                contador++;
            }
        }

        System.out.println("Cantidad: " + contador);

    }
}
