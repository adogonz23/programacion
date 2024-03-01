package ies.puerto;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String [] args ) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("introduce un valor");
        int numero =scaner.nextInt();
        if (numero<0) {
            throw new IllegalArgumentException("El numero tiene que ser positivo");
            
        }
        System.out.println(numero);
    }

}
