package ies.puerto;

/**
 * Calcula el promedio de los elementos en un array de números en punto flotante.
 * @author adogonz23
 */

public class Ejercicio2 {


    /**
     * metedo para calcular el promedio de un array
     * @return devuelve el valor de la suma total de los valores dentro del array divido por su tamaño
     */
    public float promedioArray(float[]array){
        float promedio;
        int suma=0;
                for(int i=0; i <array.length;i++){
                    suma+=array[i];
                }
                promedio=suma/array.length;
                return promedio;
    }
}

