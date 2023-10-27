package ies.puerto;

import java.util.Scanner;

/**
 * Realizar un programa que calcule el sueldo de un trabajador, el programa debe de tener un método que reciba el numero de horas que has trabajado en un mes, las horas se pagan a 10€.
 * @author adogonz23
 */

public class Ejercicio1 {
    /**
     * metodo para calcular el sueldo 
     * @param horasTrabajadas Numero de horas trabajadas
     * @return
     */
    public static int calcularSueldo(int horasTrabajadas) {
        int sueldoPorHora = 10;
        int sueldo = horasTrabajadas * sueldoPorHora;
        return sueldo;
        }
    
    public static void main(String[] args) {
        System.out.println("introduce el numero de horas");
        int horasTrabajadas;
        Scanner scaner = new Scanner(System.in);
        horasTrabajadas= scaner.nextInt();

    
        int sueldo = calcularSueldo(horasTrabajadas);
    
        System.out.println("El sueldo es: " + sueldo + "€");
        }
    
    
}


