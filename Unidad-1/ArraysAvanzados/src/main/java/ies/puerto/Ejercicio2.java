package ies.puerto;
/** Programa que declare un array de 10 enteros y pida numeros para rellenarlos hasta que se llene el vector o se introduzca un valor negativo. 
 * @author adogonz23
 */

import java.util.Scanner;

public class Ejercicio2 {
    Scanner scaner =new Scanner(System.in);
/**
 *  metodo que introduce valores dentro de un array y en caso de que sea negativo corta el proceso 
 * @return un array con valores introducidos por partalla
 */
    public int[] introducirValores(int[] array){
        int i=0;
        int temporal;
        do{
            System.out.println("ingrese valor");
            temporal=scaner.nextInt();
            if(temporal>0){
                i++;
            }else{return array;}
        }while(i<array.length);
        
        return array;
    }
    /**
     * metodo que imprime los valores dentro del array omitiendo los ceros(se qeu no es la solucion correcta pero no se como eliminar los elementos de un array y acortar su tamaño)
     * @param array con lo valores introducidos
     */
    public void imprimirArrays(int[]array){
        for(int i=0;i<array.length && array[i]!=0;i++){
            System.out.println(array[i]);
        }
    }

}
