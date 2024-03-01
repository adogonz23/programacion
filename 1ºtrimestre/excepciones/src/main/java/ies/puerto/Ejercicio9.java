package ies.puerto;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws NumeroNegativoException{
        Scanner scaner =new Scanner(System.in);
        System.out.print("introduce un numero mayor o igual que 0");
        int numero=scaner.nextInt();
        if (esPositivo(numero)) {
            System.out.println("el numero: "+numero+" es positivo");
        }
        scaner.close();
    }

    public static boolean esPositivo(int numero) throws NumeroNegativoException {
    if (numero<0) {
        throw new NumeroNegativoException("El numero "+numero+"es negativo");
    }
    return true;
    }
}
