package org.example;

import java.util.Arrays;
import java.util.Random;

public class PuntoDieciocho {
    public static void main(String[] args) {

        // Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas,
        // letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números aleatorios y la clase String
        // para manipular la contraseña.

        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String combinados = mayusculas + minusculas + numeros;

        int cantidad = 8;
        Random random = new Random();

        char[] aleatorio = new char[cantidad];
        for (int i = 0; i < cantidad; i++){
            int index = random.nextInt(combinados.length());
            char caracter = combinados.charAt(index);
            aleatorio[i] = caracter;
        }
        String contrasena = new String(aleatorio);
        System.out.println("Contraseña generada: " + contrasena);
    }
}
