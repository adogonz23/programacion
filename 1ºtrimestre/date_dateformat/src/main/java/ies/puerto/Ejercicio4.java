package ies.puerto;
/**
 * @author adogonz23
 * Implementar un programa que sume 10 días a la fecha actual utilizando la clase Calendar
 */

import java.util.Calendar;
import java.util.Date;

public class Ejercicio4 {

    public static void main(String[] args) {

    Calendar calendario = Calendar.getInstance();
    Date fechaActual= calendario.getTime();
        System.out.println(fechaActual);
    
        calendario.add(calendario.DAY_OF_MONTH,10);
        Date fechaNueva= calendario.getTime();
        System.out.println(fechaNueva);
    }
}
