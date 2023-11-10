package ies.puerto;
/**mplementa el algoritmo de ordenamiento de burbuja para ordenar un array de números enteros.

_El ordenamiento de burbuja es un algoritmo de ordenamiento simple que funciona comparando repetidamente pares de elementos adyacentes y intercambiándolos si están en el orden incorrecto. Este proceso se repite hasta que no se requieren más intercambios, lo que indica que el array está ordenado:

Pasos:

El ordenamiento de burbuja sigue estos pasos:

    Comparación de Elementos:
        Compara cada par de elementos adyacentes en el array.

    Intercambio de Elementos:
        Si los elementos están en el orden incorrecto, los intercambia.

    Repetición:
        Repite los pasos 1 y 2 para cada elemento en el array.

    Iteraciones:
        Repite todo el proceso para un número de iteraciones igual al tamaño del array.

    Array Ordenado:
        El array está ordenado cuando no se realizan más intercambios en una iteración completa.

 * @author adogonz23
 */
public class Ejercicio2 {
/**
 * metodo que compara los valores dentro de un array y los ordena y los va metiendo en un nuevo array
 * @param array valores dentro de una rrray x
 * @return un array nuevo con los numeros ordenados
 * 
 */
    public int[] compararElementos(int[]array){
        int[] array2= new int[array.length];
        for(int i=0; i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]) {
                    
                    array2[i]=array[i] ;
                    
                }else{
                    array2[i]=array[j];
                    
                }
            }
        }
        return array2;
    }
}
