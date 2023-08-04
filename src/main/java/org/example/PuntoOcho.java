package org.example;

import java.util.Scanner;

public class PuntoOcho {
    public static void main(String[] args) {

        /* Realiza un programa que simule un juego de adivinar un número.
         El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo.
         El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar. */

        Scanner sc = new Scanner(System.in);
        int numRandom = (int) (Math.random() * 100 + 1);
        boolean esCorrecto = false;
        System.out.println(numRandom);

        System.out.println("Juego de adivinar el numero");
        System.out.println("Ingresa un numero del 1 al 100");

        while (!esCorrecto) {
            System.out.print("Ingrese el numero: ");
            int numero = sc.nextInt();
            if (numero == numRandom) {
                esCorrecto = true;
            } else if (numero > numRandom) {
                System.out.println("El numero ingresado es mayor");
            } else {
                System.out.println("El numero ingresado es menor");
            }
        }
        System.out.println("El numero es correcto: " + numRandom);
    }
}
