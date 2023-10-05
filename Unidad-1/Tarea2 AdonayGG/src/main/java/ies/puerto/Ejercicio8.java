package ies.puerto;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //n=numero de aignaturas, s=Suma, x= nota de asignatura p=Promedio de notas
        int n,s=0,x;
        float p;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar cantidad de asignaturas:");
        n=scanner.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println(" nota de la asinatura ["+i+"]=");
            x=scanner.nextInt();
            s=s+x;
        }
        p=s/n;

        System.out.println("El Promedio es:" +p);
    }
}
