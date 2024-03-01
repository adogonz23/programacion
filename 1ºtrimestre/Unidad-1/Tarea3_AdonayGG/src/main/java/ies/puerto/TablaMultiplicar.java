package ies.puerto;

import java.util.Scanner;

//  Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for. Solicita el valor de la tabla por teclado.
public class TablaMultiplicar {
    public static void main (String[]args){
        Scanner scaner = new Scanner(System.in);// escaner pra introducir valores de variables.
        int valorMin, valorMax;
        int n;
        System.out.println("el numero de cual queremos saber la tabla");
        n= scaner.nextInt();
        System.out.println("introduzca el valor minimo de la tabla");
        valorMin = scaner.nextInt();
        System.out.println("introduzca el valor maximo de la tabla");
        valorMax = scaner.nextInt();
        int multiplicar; 
        for(int i= valorMin; i <= valorMax;i++){// buvle for que nos recorrea desde el valor minimo hasta el maximo que hayamos dado ++
            multiplicar= i*n; 
          
            
            System.out.println(n+" * "+i+ "=" +multiplicar);// nos imprimira el numero multiplicado por el valor de i y nos dara el resultado.


        }
        
    }
    
    
    
}
