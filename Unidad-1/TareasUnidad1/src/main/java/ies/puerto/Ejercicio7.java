package ies.puerto;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int velocidadKm;
        System.out.println("introduce la velocidad del vehiculo :");
        velocidadKm= scanner.nextInt();

        int velocidadMs = ( velocidadKm * 1000 / 3600);
        System.out.println(velocidadMs+ "metros por segundo");

    }
}
