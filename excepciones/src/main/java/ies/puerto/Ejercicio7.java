package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int dividendo=0;
        int divisor=0;
        try {
            System.out.println("Introduce el dividendo");
            dividendo= scaner.nextInt();
            System.out.println("Introduce el divisor");
            divisor=scaner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Error al introducir el tipo de dato");
        }
        int division=dividendo/divisor;
        System.out.println(division);
    }
    
}
