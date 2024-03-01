package ies.puerto;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    int N;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Introduzca el valor: ");
        N = scanner.nextInt();
        if (N %2 ==0){
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
    }
}
