package ies.puerto;

import java.util.Calendar;

public class Ejercicio9 {
    public static void main(String[] args) {
        Calendar calendario= Calendar.getInstance();
        int mes = calendario.get(Calendar.MONTH)+1;
        int anio = calendario.get(Calendar.YEAR);
        calendario.set(anio,mes -1,1);
        System.out.println(calendario.getTime());
    }
}
