package ies.puerto;

import java.util.Scanner;

public class MCD {
    public static void main (String[] args) {
        Scanner teclado= new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese primer numero:");
        num1=teclado.nextInt();
        System.out.println("Ingrese segundo numero:");
        num2=teclado.nextInt();


        while(num1 != num2)// bucle que se repite hasta que el valor de num1 seas igual num2 que ese sera el minimo comun divisor
            if(num1>num2)
                num1= num1-num2;
            else
                num2= num2 - num1;

        System.out.println("El MCD es:" +num1);

    }

}
