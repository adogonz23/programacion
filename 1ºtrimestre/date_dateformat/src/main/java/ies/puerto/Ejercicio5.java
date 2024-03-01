package ies.puerto;

import java.util.Calendar;
import java.util.Date;

/**
 * sume dos meses
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();
        Date fechaActual = calendario.getTime();
        System.out.println(fechaActual);

        calendario.add(calendario.MONTH, -2);
        Date nuevaFecha=calendario.getTime();
        System.out.println(nuevaFecha);
    }
}
