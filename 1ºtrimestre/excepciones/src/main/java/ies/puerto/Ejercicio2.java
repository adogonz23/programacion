package ies.puerto;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception{
        String strNumero= pedirValores();
        int numero= transformarStrInt(strNumero);
        System.out.println("valor del numero transformado"+numero);
        
    }
    public static String pedirValores(){
            Scanner scaner = new Scanner(System.in);
            System.out.println("introduzca un valor:");
            String strValor= scaner.nextLine();
            
        return strValor;
    }
    public static int transformarStrInt(String strValor) throws Exception{
        int numero=0;
        try {
            numero=Integer.parseInt(strValor);
        } catch (NumberFormatException numberFormatException) {
        throw new Exception("El valor introducido:"+strValor+", no es un numero");
        }
        
        return numero;
    }
}
