package ies.puerto;

import java.util.Arrays;

/** Implementa el algoritmo de búsqueda binaria para encontrar la posición de un elemento en un array ordenado.

La búsqueda binaria es un algoritmo de búsqueda eficiente que sigue estos pasos:

    Inicio y Fin:
        Inicia con el array ordenado y establece un índice de inicio y fin.

    Punto Medio:
        Calcula el índice del punto medio entre el inicio y el fin.

    Comparación:
        Compara el valor buscado con el elemento en el punto medio.
            Si son iguales, se ha encontrado el elemento y se devuelve su posición.
            Si el valor buscado es menor, repite la búsqueda en la mitad izquierda.
            Si el valor buscado es mayor, repite la búsqueda en la mitad derecha.

    Repetición:
        Repite los pasos 2 y 3 hasta encontrar el elemento o hasta que el índice de inicio sea mayor que el índice de fin
 *   @author adogonz23
 */
public class Busqueda{

    public int encontra(int[] array, int valor){
        Arrays.sort(array);
        int inicio= array[0];
        int fin = array[array.length-1];
        int medio= array[encontrarPosicion(array)];
        while(inicio<=fin){
            if (array[medio]== valor){
            return medio;
        }else {
            if (array[medio]< valor) {
                inicio= medio+1;
            }else{
                fin=medio-1;
            }
        }
        }
        return -1;
    } 
    
    
    public int encontrarPosicion(int[]array){
        int posicionMedio=0;
        posicionMedio=(array.length-1)/2;
        return posicionMedio;
    }
}

