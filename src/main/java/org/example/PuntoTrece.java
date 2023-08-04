package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PuntoTrece {
    public static void main(String[] args) {

        // Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales

        Scanner sc = new Scanner(System.in);
        double ingreso;
        int decimal;
        System.out.print("Ingrese un numero: ");
        ingreso = sc.nextDouble();
        System.out.print("Ingrese el numero de decimales: ");
        decimal = sc.nextInt();

        BigDecimal numero = new BigDecimal(ingreso);

        BigDecimal redondeado = numero.setScale(decimal, RoundingMode.HALF_UP);
        System.out.println("Numero redondeado: " + redondeado);


    }
}
