package ies.puerto;

/**
 *Escribe un programa que calcule la suma de todos los elementos en un array de enteros.
 * @author adogonz23
 */
public class Ejercicio1 {

    /**
     * metodo para culcular la suma de valores de un array
     * @return devuelve el valor de la suma de todos los numeros dentro del arrays
     */
    public static int sumaArray(int[]array){
            int suma=0;
            for(int i=0; i<array.length; i++){
                suma+= array[i];
        }
            return suma;
    }

}