package ies.puerto;
/**
 * Crea un programa que reemplace todas las ocurrencias de una letra específica en una cadena de texto.
 */
public class Ejercicio5 {   
    public static void main(String[] args) {
        String frase="mi moto alpine derrapante";
        
        System.out.println(reamplazar('i', frase, 'e'));
    }
    public static String reamplazar(char caracterBuscado,String frase, char remplazo){
        String nuevaFrase="";
        for(int i=0;i<frase.length();i++){
            char caracter=frase.charAt(i);
            if (caracter==caracterBuscado) {
                nuevaFrase=nuevaFrase + remplazo;
            }else{
            nuevaFrase=nuevaFrase + frase.charAt(i);
        }
        }
        return nuevaFrase;
    }
}
