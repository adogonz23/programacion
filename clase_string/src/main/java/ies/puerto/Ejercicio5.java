package ies.puerto;
/**
 * Crea un programa que reemplace todas las ocurrencias de una letra específica en una cadena de texto.
 */
public class Ejercicio5 {   
    public static void main(String[] args) {
        String frase="mi moto alpine derrapante";
        reamplazar('i', frase);
        System.out.println(frase);
    }
    public static void reamplazar(char caracterBuscado,String frase){
        for(int i=0;i<frase.length();i++){
            char caracter=frase.charAt(i);
            if (caracter==caracterBuscado) {
                ;
            }
        }
    }
}
