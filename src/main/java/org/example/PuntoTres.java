package org.example;

import java.util.Scanner;

public class PuntoTres {

    public static void main(String[] args) {

        //Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.

        Scanner sc = new Scanner(System.in);

        String radio;
        double area;

        System.out.print("Ingrese el radio del circulo: ");
        radio = sc.nextLine();

        area = Math.PI * Math.pow(Double.parseDouble(radio), 2);
        System.out.println("El area del circulo es: " + area);

    }
}
