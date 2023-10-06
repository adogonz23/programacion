package ies.puerto;
import java.util.Scanner;
// calcula los numeros fibonachis hasta la posicion "P"
public class Fibonachi1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int p,fibo1=0,fibo2=1,suma=0;
        System.out.println("introduzca la posicion de numero fibonachis que desea ver");
        p = sc.nextInt();

        for(int i= 0; i < p; i++){
            System.out.println(fibo1);
            suma=fibo1 +fibo2;
            fibo1=fibo2;
            fibo2=suma;

        }

    }
}