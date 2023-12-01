package ies.puerto;
/**
 * 

Implementa un programa que invierta una cadena de texto dada.

 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String nombre ="Adonay";
        String nombreInv= "";
    for(int i= nombre.length()-1;i >= 0;--i){
        nombreInv=nombreInv+nombre.charAt(i);   
    }
    System.out.println(nombreInv);
    }

}
