package ies.puerto;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.git

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, C;

        do {
            System.out.print("Introduce el valor de A: ");
            A = scanner.nextInt();

            System.out.print("Introduce el valor de B: ");
            B = scanner.nextInt();

            System.out.print("Introduce el valor de C: ");
            C = scanner.nextInt();

            if (A == B || A == C || B == C) {
                System.out.println("Error: Los valores deben ser distintos. Inténtelo de nuevo.");
            } else {
                break; // Si los valores son distintos, salimos del bucle
            }
        } while (true);

        // Calcular el mayor y el menor
        int mayor = Math.max(Math.max(A, B), C);
        int menor = Math.min(Math.min(A, B), C);

        // Imprimir los resultados
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
}
