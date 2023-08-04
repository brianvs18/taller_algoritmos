package org.example;

import java.util.Scanner;

public class PuntoVeintiseis {
    public static void main(String[] args) {

        // Escribe un programa que pida al usuario una cadena y muestre cuántos caracteres tiene sin contar los espacios en blanco

        Scanner sc = new Scanner(System.in);
        String texto;
        System.out.print("Ingrese un texto: ");
        texto = sc.nextLine();
        texto = texto.replace(" ", "");
        System.out.println("Cantidad de caracteres sin expacios: " + texto.length());
    }
}
