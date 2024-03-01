package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        float dividendo=0;
        float divisor=0;
        try {
            System.out.println("Introduce el dividendo");
            dividendo= scaner.nextFloat();
            System.out.println("Introduce el divisor");
            divisor=scaner.nextFloat();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Error de tipo de dato");
        }
        float division=dividendo/divisor;
        System.out.println("El resultado es ="+division);
    
}
}
