package org.example;

import java.util.Scanner;

public class PuntoQuince {
    public static void main(String[] args) {

        //Crea un programa que pida al usuario un número entero y determine si es un número capicúa.
        // Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.

        Scanner sc = new Scanner(System.in);

        int numero;
        int aux;
        int inverso = 0;
        int digito;

        System.out.print("Digite un numero capicua: ");
        numero = sc.nextInt();
        aux = numero;

        while (aux != 0) {
            digito = aux % 10;
            inverso = inverso * 10 + digito;
            aux = aux / 10;
        }

        String resultado = (numero == inverso) ? "El numero es capicua" : "El numero no es capicua";
        System.out.println(resultado);
    }
}
