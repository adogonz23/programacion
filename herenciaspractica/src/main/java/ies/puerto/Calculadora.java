package ies.puerto;

import java.util.Scanner;

public class Calculadora extends UtilidadesCalc{
    
    static UtilidadesCalc utilidadesCalc;
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);
        System.out.println("introduce el primer valor");
        int valor1=scaner.nextInt();
        System.out.println("introduce el segundo valor");
        int valor2=scaner.nextInt();
        System.out.println(utilidadesCalc.division(valor1,valor2));
        scaner.close();
    }

    
}
