package ies.puerto;

import java.util.Arrays;

/** eliminar elementos dublicados en arrya
 * @author adogonz23
*/

public class Ejercicio8 {
    public int DetectarIguales(int[]array){
        Arrays.sort(array);
        int contador=0;
        for(int i =0;i <array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if (array[i] ==array[j]) {
                    contador++;
                }
            }
        }
        return contador;
        
    }
    public  int[] copiaIguales(int []array){
        int[]arrayCopiados= new int[array.length];
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            for(int j=i+1;j<array.length;j++){
                if (array[i]!=array[j]) {
                    arrayCopiados[i]= array[j];
                    Arrays.sort(arrayCopiados);
                }
            }
        }
        return arrayCopiados;
    }
    }

