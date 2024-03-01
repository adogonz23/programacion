package ies.puerto;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int valorA , valorB;
        //lector de variables
        System.out.println("valor de A");
        valorA = scaner.nextInt();
        System.out.println("valor de B");
        valorB = scaner.nextInt();
        if (valorA > valorB){
            System.out.println("primero" + valorB + "luego" + valorA );
        }else {
            System.out.println("primero va" + valorA + "luego" + valorB);
        }
        }
    }

