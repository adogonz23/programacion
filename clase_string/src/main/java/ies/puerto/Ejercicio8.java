package ies.puerto;
/**
 * Implementa un programa que convierta una cadena de texto a mins o mayus
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        String frase = "HoLa hOlitaaaA!";
        String fraseMins= frase.toLowerCase();
        String FraseMayus= frase.toUpperCase();
        System.out.println(frase+"\n"+fraseMins+"\n"+FraseMayus);
    }
}
