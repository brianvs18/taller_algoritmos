package org.example;

public class PuntoDiez {
    public static void main(String[] args) {
        /* Ejercicio 10: Crea un programa que muestre los primeros 20 números de la serie Fibonacci.
         La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, … */

        int serie = 20;
        int num1 = 0;
        int num2 = 1;
        int suma;

        for (int i = 0; i < serie; i++){
            System.out.print(num1 + " ");
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }
}
