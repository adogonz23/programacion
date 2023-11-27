package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author adogonz23
 */
public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner scaner = new Scanner(System.in);
        try {
            System.out.println("Ingresa una operacion matermatica");
            int operacion= scaner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            throw new Exception("El tipo de entrada no se corresponde con el tipo de dato esperado, imposible realizar una operacion matematica en un scaner");
        }finally{
            scaner.close();
            
        }
        
    }
}
