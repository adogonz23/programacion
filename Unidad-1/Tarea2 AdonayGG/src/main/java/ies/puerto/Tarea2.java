package ies.puerto;

import java.util.Scanner;

public class Tarea2 {
    public static void main (String[] args){
        int valorMin,valorMax,suma, div;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el valor minimo");
            valorMin = scanner.nextInt();
        System.out.println("introduce el valor maximo");
            valorMax = scanner.nextInt();

        System.out.println("Numeros perfectos entre" + valorMin + "y"+ valorMax + ":");
        for(; valorMin <= valorMax; valorMin++){      // el arco de numeros que vamos a comprobar
            suma = 0;
            for(div = 1; div < valorMin;divisor++){    // "div" son los divisores. Se divide desde 1 hasta "valorMin"-1                          
                 if(valorMin % divisor == 0){
                    suma = suma + div; // si es divisor se suma
                 }
            }
          if(valorMin == suma){             // si el numero es igual a la suma de sus divisores es perfecto              
             System.out.println(valorMin);
          }
        }     
    }
}