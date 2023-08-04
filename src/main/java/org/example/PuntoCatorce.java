package org.example;

import java.util.Scanner;

public class PuntoCatorce {
    public static void main(String[] args) {

        // Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto.
        // Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.

        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        System.out.print("Digite un numero: ");
         numero = sc.nextInt();
         for (int i = 1; i < numero; i++){
             if(numero % i == 0){
                 suma += i;
             }
         }
         String resultado = (suma == numero) ? "Es perfecto" : "No es perfecto";
        System.out.println(resultado);

    }
}
