package ies.puerto;

import java.util.Calendar;

public class Ejercicio3 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        int año=calendario.get(Calendar.YEAR);
        int mes=calendario.get(Calendar.MONTH);
        int dia=calendario.get(Calendar.DATE);
        int hora=calendario.get(Calendar.HOUR_OF_DAY);
        int mins=calendario.get(Calendar.MINUTE);
        int seg=calendario.get(Calendar.SECOND);
        System.out.println(año+" "+mes+" "+dia+" "+hora+" "+mins+" "+seg);
    }
    
}
