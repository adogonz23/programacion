package ies.puerto;

import java.util.Scanner;

/**
 * Crea una aplicación en Java que construya y muestre una representación gráfica de un sistema montañoso. El programa debe de solicitar por teclado el número de columnas y si es menor que cuatro generar una exception indicando el error.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int tamaño=pedirDatos();
        char [][] piramide= dibujarPiramide(tamaño);
        for(int i=0;i<piramide.length;i++){
            for(int j=i;j<piramide[i].length;j++){
                System.out.print(piramide[i][j]);
            }
            System.out.println();
        }
        
    }
    public static int pedirDatos(){
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce el numero de columnas desado");
        int tamaño=lector.nextInt();
        if (tamaño%2==0) {
            tamaño+=1;
        }
        return tamaño;
    }
    public static char[][] dibujarPiramide(int tamaño){
        char[][] piramide= new char[tamaño/2][tamaño];
        for(int i=0;i<tamaño/2;i++){
            for(int j=i;j<tamaño-i-1;j++){
                piramide[i][j]='*';
            }
        }
        return piramide;
    }
}
