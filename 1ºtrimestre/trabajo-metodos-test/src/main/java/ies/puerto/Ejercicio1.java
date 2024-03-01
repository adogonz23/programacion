package ies.puerto;

import java.util.Scanner;

/**
 * @author adogonz23
 * Implementa un programa que invierta una cadena de texto dada. La cadena debe de tener al menos 10 caracteres no vacíos. Puntuación 1 punto. (Con test que verifique el comportamiento 1,25)
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("introduzca una palabra o una frase");
        String frase= lector.nextLine(); 
        lector.close();
        if (frase.length()<10) {
            System.out.println("tamaño invalido");
        }else{
            System.out.println(" la inversa de : "+frase+" es: "+invertirString(frase));
        }
        
    }
/**
 *  Metodo qeu invierte una cadena de texto 
 * @param frase cadena de textro introducida por el usuario
 * @return un nuevo string con la cadena de texto invertida
 */
    public static String invertirString (String frase){

        String fraseInv= "";
    for(int i= frase.length()-1;i >= 0;--i){
        fraseInv=fraseInv+frase.charAt(i);   
    }
        return fraseInv;
    }
}
