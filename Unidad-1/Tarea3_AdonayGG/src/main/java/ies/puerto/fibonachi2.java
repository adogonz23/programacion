package ies.puerto;
import java.util.Scanner;
// calcula el numero fibonachi en la pocision P
public class fibonachi2{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int p,fibo1=0,fibo2=1,suma=0;
        System.out.println("introduzca la pocinion P que desa conocer");
        p = sc.nextInt();

        for(int i= 1; i < p; i++){

            suma=fibo1 +fibo2;
            fibo1=fibo2;
            fibo2=suma;

        }
        System.out.println( "el numero fibonachi en a pocicion "+ p+ " es " +fibo1);// este a diferencia del ejercicio anterior nos imprimira el valor del numero fibbonachi es "n" posición.
    }
}


