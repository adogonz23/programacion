package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Verifique si un numero entero es par o immpar.
 */
public class Ejercicio1 {
    public static boolean numeroPar(int valor){
        Integer.valueOf(valor);
        if (valor%2==0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        try {
            System.out.println("Introduce un valor entero");
            int valor1= escaner.nextInt();
            if (numeroPar(valor1)) {
                System.out.println("es par");
            }else{
                System.out.println("es impar");
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("El tipo de dato no es el correcto");
        }
        
    }
}
