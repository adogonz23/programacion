package ies.puerto;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2;
        int div;
        System.out.println("ingrese el primer valor");
        valor1 = scanner.nextInt();
        System.out.println("ingrese el segundo valor");
        valor2 = scanner.nextInt();
        while (valor1 != valor2)
            if (valor1 > valor2) {
                div = valor2 - valor1;

                div = valor1 - valor2;
            }
        System.out.println("el MCD de :" + valor1 + " y " + valor2 + "es : " + div);
    }
}
