package ies.puerto;
/**
 * programa que declare 3 arrays de cinco enteros  pida los valores de array 2 y 2 y array3 sea igual a las sumaa de array 1 y 2 posición a posición
 * @author adogonz23
 */
public class Ejercicio3 {
    Ejercicio1 ejercicio1 = new Ejercicio1();
/**
 * metodo que rellena de valores dos array y crea un tercero que lo rellena con la suma de los valores de cada posicion del aray 1 y 2;
 * @param array1 
 * @param array2
 * @return un array con suma de los valores de cada posicion del array uno y dos 
 */
    public int[] sumaArrays(int[]array1, int[]array2){
        int[]array3 = new int[array1.length];
        ejercicio1.introducirValores(array1);
        ejercicio1.introducirValores(array2);
        int suma=0;
        for(int i=0;i<array3.length;i++){
            suma=array1[i]+array2[i];
            array3[i]=suma;
        }
        return array3;
    }

}
