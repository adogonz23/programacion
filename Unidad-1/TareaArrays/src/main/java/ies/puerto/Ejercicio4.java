package ies.puerto;
/**
 * imprime los numeros pares dentro de un array
 * @author adgonz23
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo al ejercicio X");
    }
    public  static void numerosPares(){
        int[] arrayPares={4,17,21,8,55};
        int numeroPar=0;
        for(int i=0; i< arrayPares.length;i++){
            if (arrayPares[i]% 2 == 0) {
                numeroPar= arrayPares[i];
            System.out.println(numeroPar);
 
            }
        }
    }
}