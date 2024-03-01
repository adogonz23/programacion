package ies.puerto.Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Escribe un método en una clase llamada OperacionesArrayList que reciba un ArrayList de cadenas y 
 * devuelva la cantidad de elementos que comienzan con la letra 'A'. a la lista.
    Crea un programa que demuestre el comportamiento correcto del programa App+NombreIdentificativo, o test unitarios que sistituyen a este.
 */
public class Ejercicio2 {

    static List<String>listaCosaStrings;

    public static void main(String[] args) {
        listaCosaStrings= new ArrayList<>();
        Collections.addAll(listaCosaStrings, "hola", "cosa","aaaaah","maaaaama","pedro picapiedra");
        int contador=0;
        for (String cadena : listaCosaStrings) {
            if (comienzaporA(cadena)) {
                contador++;
            }    
        }
        System.out.println("el numero de cadenas de texto qeu comienzan por a son "+contador);
        
    }
    private static boolean comienzaporA(String cadena){
            
            String regex="^[aA].*";
            if (Pattern.matches(regex, cadena)) {
                return true;
            }
            return false;
        }
}
