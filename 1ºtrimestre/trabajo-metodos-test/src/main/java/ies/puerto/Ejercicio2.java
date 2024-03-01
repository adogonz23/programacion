package ies.puerto;

import java.util.Scanner;

/**
 * @author adogonz23
 * Desarrolla un programa que cuente el número de vocales en una cadena de texto. Puntuación 1 punto. Con test que verifique el comportamiento 1,25).
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        char[]vocales= {'a','e','i','o','u'};
        System.out.println("introduzca una palabra o una frase");
        String frase= lector.nextLine();
        lector.close();
        System.out.println("la frase introducida: "+frase+" contiene "+contarVocales(frase, vocales)+" vocales");
    }
    /**
     *  metodo que cuenta las vocales de una cadena de texto (se que conexpresiones regulares se puede hacer mejor, pero esta es la forma que me salio sin ayuda)
     * @param frase cadena de texto introducida por el usuario
     * @param vocales array de las vocales a comprobar
     * @return un contador qeu las vocales dentro de la cadena  de texto
     */
    public static int contarVocales(String frase, char[]vocales){
        int contador=0;
        frase.toLowerCase();
        
        for(int i =0;i<frase.length();i++){
            char caracter=frase.charAt(i);
            for(int j=0;j<vocales.length;j++){
                char vocal=vocales[j];
                if (caracter==vocal) {
                    contador++;
                }
            }
        }

        return contador;
    }
}
