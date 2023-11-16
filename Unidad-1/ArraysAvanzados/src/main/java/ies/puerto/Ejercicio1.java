package ies.puerto;
/** Programa que lea por te clado las 5 notas obtenidas por un alumno almacenadas en un array. mostrar todas las notas, nota media nota mas baja y nota mas alta.
 * @author adogonz23
 */

import java.util.Scanner;

public class Ejercicio1 {
    Scanner scaner = new Scanner(System.in);
/**
 * 
 * @return un array con las 5 notas introducidas
 */
    public int[] introducirValores(int[]arrayNotas){
        int temporal;
        for(int i=0;i<arrayNotas.length;i++){
            System.out.println("ingrese el valor de la nota");
            temporal=scaner.nextInt();
            arrayNotas[i]=temporal;
        }
        return arrayNotas;
    }
    /**
     *  metodo que imprime todas las notas
     * @param arrayNotas array que contiene las notas del alumno.
     */
    public void imprimirArrays(int[]arrayNotas){
        System.out.println("Notas del alumno X");
        for(int i=0;i< arrayNotas.length;i++){
            System.out.println(arrayNotas[i]);
        }
    }
    /**
     * 
     * @param arrayNotas notas del alumno   
     * @return devuelve la nota media
     */
    public int media(int[]arrayNotas){
        int promedio=0;
        int suma=0;
        for (int i=0;i<arrayNotas.length;i++){
            suma=suma+arrayNotas[i];
        }
        promedio= suma/arrayNotas.length;
        return promedio;
    }
    /**
     * ordena el array y devuelve el valor mas alto
     * @param arrayNotas notas del alumno
     * @return la nota mas alta
     */
    public int hallarMaxima(int[]arrayNotas){
        int notaMaxima=arrayNotas[4];
        for(int i=0;i<arrayNotas.length;i++){
            for(int j=0;j<arrayNotas.length;j++){
                if (arrayNotas[j]>arrayNotas[j+1]) {
                    int temporal= arrayNotas[j];
                    arrayNotas[j]=arrayNotas[j+1];
                    arrayNotas[j+1]=temporal;
                }
            }
        }
        return notaMaxima;
    }
    /**
     * metodo qeu ordena el array y devuelve la nota mas baja
     * @param arrayNotas array con las notas del alumno
     * @return la nota mas baja
     */
    public int hallarMinima(int[]arrayNotas){
        int notaminima=arrayNotas[0];
        for(int i=0;i<arrayNotas.length;i++){
            for(int j=0;j<arrayNotas.length;j++){
                if (arrayNotas[j]>arrayNotas[j+1]) {
                    int temporal= arrayNotas[j];
                    arrayNotas[j]=arrayNotas[j+1];
                    arrayNotas[j+1]=temporal;
                }
            }
        }
        return notaminima;
    }
}
