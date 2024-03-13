package ies.puerto;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrama {
    public static void main( String[] args ){
        String palabra= "Hola";
        String palabra2= "ohla";
        System.out.println(esAnagrama(palabra, palabra2));
        
    }
    public static boolean esAnagrama(String palabra,String anagrama){
        char[]charPalabra= palabra.toLowerCase().toCharArray();
        char[] charAnagrama= anagrama.toLowerCase().toCharArray();
        Arrays.sort(charAnagrama);
        Arrays.sort(charPalabra);
        return Arrays.equals(charAnagrama, charPalabra);
    }
    
}
