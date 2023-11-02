package ies.puerto;
/**
 * imprime los numeros pares dentro de un array
 * @author adgonz23
 */
public class Ejercicio4 {

    public  static void numerosPares(int[] arrayPares){

        int numeroPar;
        for(int i=0; i< arrayPares.length;i++){
            if (arrayPares[i]% 2 == 0) {
                numeroPar= arrayPares[i];
            System.out.println(numeroPar);

            }
        }
    }
}