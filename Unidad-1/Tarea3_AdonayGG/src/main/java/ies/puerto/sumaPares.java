package ies.puerto;
//Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.

import java.util.Scanner;

public class sumaPares {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        int valorMax,suma=0, i=2;
        System.out.println("introduzca el valor tope");
        valorMax = scanner.nextInt();


        do{ // empezamos por 2 ya que sabesmos que el uno es un numero impar
            suma=suma+i;
            
            i=i+2;// sumamos de 2 en 2 el valor inicial de i ya que sabremos que asi siempre sera par 
            
            
            

        }while (i <= valorMax);// mientras el valor de i sea menor o igual que i hare el bucle de arriba hasta qeu se acabae la condicion e imprima el valor total.
        System.out.println("la suma de numeros pares entre 1 y "+ valorMax+ " es igual a :"+suma);
    }
}