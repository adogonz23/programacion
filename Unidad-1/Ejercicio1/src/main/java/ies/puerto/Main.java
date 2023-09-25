package ies.puerto;

import java.util.Scanner;

/**
 * clase que realiza el ejercicio numero 1 de las tareas
 */
public class Main {
    public static void main(String[] args) {
        int valorA;
        int valorB;

        Scanner lectura= new Scanner (System.in);

        //bloque 1: pider por pantalla valor y asigna valordo {
        do {


            System.out.println("Ingresa el valor de la variable A:");
            valorA = lectura.nextInt();
            System.out.println("valor de la variable A:+" + valorA);

            System.out.println("Ingresa el valor de la variable B:");
            valorB = lectura.nextInt();
            System.out.println("valor de la variable B:+" + valorB);

            //bloque 2: verifica si los valores son iguales
        if (valorA == valorB){
            System.out.println("los valores introducidos son iguales");
        }

        }while (valorA == valorB);
        if (valorA > valorB){
            System.out.println("A es el mayor");
        }else {
            System.out.println("B es el mayor");
        }




        //bloque 3: verifica si A>B
        //bloque 4: muestra por pantalla el valor mayor
    }

}
