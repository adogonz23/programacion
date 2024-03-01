package ies.puerto;
/**
 * Crea un programa que verifique si una cadena de texto comienza o termina con una subcandea especifica.
 */
public class Ejercicio9 {

    public static boolean comprobacion(String frase, String subFrase){
        if (frase.startsWith(subFrase)||frase.endsWith(subFrase)) {
            return true;
        }
        return false;
    }
}
