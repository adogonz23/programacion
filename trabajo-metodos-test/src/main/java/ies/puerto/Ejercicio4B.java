package ies.puerto;

import java.util.Scanner;

/**
 * @author adogonz23   
 * Desarrolla un programa que convierta un número entero a su representación binaria utilizando métodos de la clase Integer. Puntuación 1 punto. Con test que verifique el comportamiento 1,25)
 */
public class Ejercicio4B{
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        System.out.println("introduzca un numero entero");
        int numero= lector.nextInt();
        System.out.println("el numero: "+numero+" en binario es igual a= "+enteroABinario(numero));
        lector.close();
        
    }
    /**
     * metodo qeu transforma un numero entero en binario, es un metodo propio de la clase Integer. 
     * @param numero introducido para pasar a binario
     * @return un String con los "1 y 0" que formarian el numero en binario
     */
    public static String enteroABinario(int numero){
        String numeroBinario= Integer.toBinaryString(numero);
        return numeroBinario;
    }
    
}
