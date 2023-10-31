package ies.puerto;

/** Encuentra el valor máximo y mínimo en un array de enteros.
 * @author adogonz23
 */
public class Ejercicio3 {
    

 /**
  * metodo que nos permite hayar el valor maximo dentro de un array
  * @return una vez comparado todos los valores del arrray devuelve el mayor
  */   
    public int valorMaximo(){
        int[] array= {10,15,6,8};
        int max = array[0];
        for(int i = 1; i < array.length;i++){
            if (array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
     public int valorMinimo(){
        int[] array= {10,15,6,8};
        int min = array[0];
        for(int i = 1; i < array.length;i++){
            if (array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }  
}