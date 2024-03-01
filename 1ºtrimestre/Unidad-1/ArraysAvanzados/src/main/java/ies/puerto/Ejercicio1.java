package ies.puerto;
/** Programa que lea por te clado las 5 notas obtenidas por un alumno almacenadas en un array. mostrar todas las notas, nota media nota mas baja y nota mas alta.
 * @author adogonz23
 */

import java.util.Scanner;

public class Ejercicio1 {
    Scanner scaner = new Scanner(System.in);
/**
 * Metodo que pide datos y los introduce en un array
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
    public float media(int[]arrayNotas){
        float promedio=0;
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
        int notaMaxima=arrayNotas[arrayNotas.length-1];
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
        for(int i=0;i<arrayNotas.length-1;i++){
            for(int j=0;j<arrayNotas.length-1-i;j++){
                if (arrayNotas[j]>arrayNotas[j+1]) {
                    int temporal= arrayNotas[j];
                    arrayNotas[j]=arrayNotas[j+1];
                    arrayNotas[j+1]=temporal;
                }
            }
        }
        return notaminima;
    }
    public int[] ordenarArray(int[]array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]) {
                    int temporal= array[j];
                    array[j]=array[j+1];
                    array[j+1]=temporal;
                }
            }
        }
        return array;
    }
    public int[] arrayInverso(int[]array){
        int[] invertido= new int[array.length];
        for (int i=0;i<array.length;i++){
            invertido[i]= array[array.length-1-i];
        }
        return invertido;
    }
    public void rellenaArray(int[]array){
        int i=0;
        int temporal=0;
        boolean salir=false;
        do{
            System.out.println("introduzca un valor");
            temporal=scaner.nextInt();
            if (temporal< 0) {
                salir= true;
            }else{
                array[i]=temporal;
                i++;
            }
        }while (i<array.length && !salir);
        printArray(array, i);
    }
    public void printArray(int[]array, int elemtosImprimir){
        for (int i=0;i <= elemtosImprimir;i++){
            System.out.println(array[i]+" ");
        }
    }
}
