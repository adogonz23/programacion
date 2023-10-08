package ies.puerto;
import java.util.Scanner;
// calcula los numeros fibonachis hasta la posicion "P"
public class Fibonachi1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int p,fibo1=0,fibo2=1,suma=0; // asignaremos valor a las variables, fibo1 y 2 seran y 1 ya que sabesmos que esos son los 2 primeros numeros fibonachis 
        System.out.println("introduzca la posicion de numero fibonachis que desea ver");
        p = sc.nextInt();

        for(int i= 0; i < p; i++){
            System.out.println(fibo1);//  imprimira simpre el fibo1 y mediante la siguiente formula hara incrementar el fibbo1 imprimiendolos en pantalla hasta que i llege a el numero de posicion ingresado.
            suma=fibo1 +fibo2;
            fibo1=fibo2;
            fibo2=suma;

        }

    }
}