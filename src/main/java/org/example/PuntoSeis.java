package org.example;

import java.util.Scanner;

public class PuntoSeis {
    public static void main(String[] args) {

        // Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        if(numero > 0)
        {
            System.out.println("EL numero es positivo");
        }
        else if(numero < 0)
        {
            System.out.println("El numero es negativo");
        }
        else if(numero == 0)
        {
            System.out.println("El numero es cero");
        }

    }
}
