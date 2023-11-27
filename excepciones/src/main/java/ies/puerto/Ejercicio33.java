package ies.puerto;
/**
 * Ejercicio3 nullpointer
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        String vacio=null;
        int tamnioVacio=vacio.length();
        try {
            System.out.println("el tamaño de vacio es :"+tamnioVacio);
        } catch (NullPointerException nullPointerException) {
            System.out.println("se esta haciendo una llamada a un metodo null");
        }
    }
}
