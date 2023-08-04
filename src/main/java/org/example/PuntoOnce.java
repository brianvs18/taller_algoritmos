package org.example;

import java.util.Scanner;

public class PuntoOnce {
    public static void main(String[] args) {
        // Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón.
        // El usuario debe ingresar las longitudes de los tres lados.

        Scanner sc = new Scanner(System.in);

        int lado1;
        int lado2;
        int lado3;
        float area;

        System.out.print("Ingrese el primer lado del triangulo: ");
        lado1 = sc.nextInt();
        System.out.print("Ingrese el segundo lado del triangulo: ");
        lado2 = sc.nextInt();
        System.out.print("Ingrese el tercer lado del triangulo: ");
        lado3 = sc.nextInt();

        area = (float) (lado1 + lado2 + lado3) /2;
        System.out.println("Area del triangulo: " + area);

    }
}
