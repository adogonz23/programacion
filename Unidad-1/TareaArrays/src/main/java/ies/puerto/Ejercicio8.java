package ies.puerto;

import java.util.Arrays;

/** eliminar elementos dublicados en arrya
 * @author adogonz23
*/

public class Ejercicio8 {
    //public int DetectarIguales(int[]array){
      //  Arrays.sort(array);
        //int contador=0;
       // for(int i =0;i <array.length;i++){
         //   for(int j=i+1;j<array.length;j++){
           //     if (array[i] ==array[j]) {
             //       contador++;
               // }
           // }
        //}
       // return contador;
        
   // }
    public  int[] copiaIguales(int []array){
        int[]arrayCopiados= new int[array.length];
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            for(int j=i+1;j<array.length;j++){
                if (array[i]==array[j]) {
                    arrayCopiados[i]= array[i];
                    Arrays.sort(arrayCopiados);
                    arrayDefinitivo(arrayCopiados);
                }
            }
        }
        return arrayCopiados;
    }
    public int[] arrayDefinitivo(int[]array){
        for(int i=0; i<array.length;i++){
            if (array[i]== 0) {
                for(int j=i;j<array.length -1;j++){
                    array[j] = array[j+1];
                }
                
            }
        }
        return array;
    }
    
    }

