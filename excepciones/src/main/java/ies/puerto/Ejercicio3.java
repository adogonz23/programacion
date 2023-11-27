package ies.puerto;

import java.util.Scanner;

/**
 * @author adogonz23
 */
public class Ejercicio3 {
public static void main(String[] args) throws Exception {
    int[] array={1,2,3};
    try {
        System.out.println(array[4]);
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        throw new Exception("La posicion introducida: "+4+", se sale del rango del array");
    }
    

}
}
