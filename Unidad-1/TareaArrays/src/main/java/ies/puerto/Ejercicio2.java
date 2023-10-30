package ies.puerto;

/**
 * Calcula el promedio de los elementos en un array de números en punto flotante.
 * @author adogonz23
 */

public class Ejercicio2 {
     public static public static void main(String[] args) {

     }

    /**
     * metedo para calcular el promedio de un array
     * @return devuelve el valor de la suma total de los valores dentro del array divido por su tamaño
     */
     public float promedioArray(){
         float[] array={10f,20f,25f,12f};
         float promedio;
         int suma=0
                 for(int i=0; i <array.length;i++){
                     suma+=array[i];
                 }
                 promedio=suma/array.length;
                 return promedio;
     }
 }

