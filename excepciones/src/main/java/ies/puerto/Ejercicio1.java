package ies.puerto;

import java.util.Scanner;

/**
División por Cero
    Escribe un programa que solicite al usuario dos números e imprima el resultado de la división. Asegúrate de manejar la excepción ArithmeticException si el segundo número ingresado es 0.
 * 
 * @author adogonz23
 */

public class Ejercicio1 {
    public static int pedirValores(){
            Scanner scaner = new Scanner(System.in);
            System.out.println("introduzca un valor:");
            int valor= scaner.nextInt();
            
        return valor;
    }
    public static void main(String[] args) throws Exception{
        int valor1= pedirValores();
        int valor2=pedirValores();
        int resultado= division(valor1, valor2);
        System.out.println(resultado);
    }
    /**
     *  metodo qeu hace una division
     * @param dividendo numero a dividir
     * @param dive
     * @return
     * @throws Exception
     */
    public static int division(int dividendo, int divesor) throws Exception{
        int resultado=0;
        try {
            resultado=dividendo/divesor;
        } catch (ArithmeticException e) {
            String mensajeError="Se intenta realizar una division por 0";
            throw new Exception(mensajeError);       
        }
        return resultado;
    }
}
