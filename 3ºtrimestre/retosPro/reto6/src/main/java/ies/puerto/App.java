package ies.puerto;


import java.util.Arrays;
import java.util.List;

public class App {
    public static void main( String[] args ){
        char numero = 9;
        double resultado =  Math.pow(numero, 23);
        System.out.println(Math.min(100, 10));
    }
    public static String nocomunes(String palabra, String palabra2){
        String salida="";

        for (char caracter : palabra.toLowerCase().toCharArray()) {
            if (palabra2.indexOf(caracter)==-1 && salida.indexOf(String.valueOf(caracter))==+1) {
                salida+=caracter;
            }
        }
        return salida;
    }
    
}
