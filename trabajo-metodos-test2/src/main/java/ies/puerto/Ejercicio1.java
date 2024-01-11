package ies.puerto;

import java.util.Scanner;

/**
 * Crea una aplicación en Java que construya y muestre una representación gráfica de un triángulo invertido. El programa debe de solicitar por teclado el número de columnas y si es menor que cuatro generar una exception indicando el error. 
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int tamaño= obtenerTamaño();
        char[][] piramide=dibujartriangulo(tamaño);
        for(int i=0;i<tamaño/2;i++){
            for (int j=i;j<tamaño-i-1;j++){
                System.out.println(piramide[i][j]);;
            }
        }
        
    }
    public static int obtenerTamaño(){
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce el numero de columnas");
        int tamaño= lector.nextInt();
        if (tamaño%2==0) {
            tamaño=tamaño+1;
        }
        return tamaño;
    }
    public static char[][] dibujartriangulo (int tamaño){
        char[][] piramide= new char[tamaño/2][tamaño];
        for(int i=0;i<tamaño/2;i++){
            for (int j=i;j<tamaño-i-1;j++){
                piramide[i][j]='*';
            }
        }
        return piramide;
    }
}
