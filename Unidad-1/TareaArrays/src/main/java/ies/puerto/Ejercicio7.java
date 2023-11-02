package ies.puerto;
/**
 * Ordena un array de enteros en orden ascendente
 * @author adogonz23
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int[]array= {30,60,15,50,8};
        arrayOrdenado(array);
        for(int numero:array){
            System.out.println(numero);
        }
    }
   /**
    * metodo que hace una copia del arrays ordenado
    * @param array
    * @return
    */
    public static int[] arrayOrdenado(int[]array) { 
        ordenarArray(array); 
        int[]copiaArray= new int[array.length];
        for(int i=0;i< array.length;i++){
            copiaArray[i]=array[i];
        }
        return copiaArray;
    }
/**
 * metodo que ordena el arrays
 * @param array que queremos ordenar
 */
    public static void ordenarArray(int[] array){
        int n = array.length;
        for(int i=0;i< n-1; i++){
            for (int j=0; j< n-i-1;j++){
                if (array[j]>array[i]){
                    int temp= array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    
                }
            }
        }
    }
}
    
