package ies.puerto;
/**
 * Combina dos arrays ordenados en uno solo manteniendo el orden.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
    }
    
    public int[] combinaArrays(int[]array1,int[]array2){
        int[] arrayResultado= new int[array1.length+array2.length];
        int i;
        for(i=0; i<array1.length;i++){
            arrayResultado[i]=array1[i];
        }
        for(int j=0;j<array2.length;j++){
            arrayResultado[i++]=array2[j];
        }

        return arrayResultado;
    }
}