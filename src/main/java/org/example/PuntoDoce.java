package org.example;

import java.util.Scanner;

public class PuntoDoce {
    public static void main(String[] args) {
        // Realiza un programa que pida al usuario un número entero y determine si es un número primo o no

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        boolean esPrimo = false;
        if(numero == 0 || numero == 1 || numero ==4){
            esPrimo = false;
        }
        for (int i = 2; i < numero / 2; i++){
            if(numero % i == 0){
                esPrimo = false;
            }else esPrimo = true;
        }
        String resultado = (esPrimo) ? "Es primo" : "No es primo";
        System.out.println(resultado);
    }
}
