package ies.puerto;

import java.util.Scanner;

/**
 * Realiza un programa que tenga un método al que se le pase un número e indique si es positivo o negativo y si es par o impar.
 * @author adogonz23
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("introduce un numero");
        int numero;
        Scanner scaner = new Scanner(System.in);
        numero = scaner.nextInt();

        analizarNumero(numero);
    }

    /**
     * metodo qeu primero nos dice sies positivo o negativo y luego si es par o impar
     * @param numero parametro a analizar
     * @return 
     */
    public static void  analizarNumero(int numero) {
        
        if (numero > 0) {
            System.out.println(numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " es negativo.");
        } else {
            System.out.println(numero + " es neutro.");
        }

        
        if (numero % 2 == 0) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }
    }

    
    

}
    