package ies.puerto;

import java.util.Date;

/**
 * Comparacion de dos fechas
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        Date fecha1 = new Date();
        Date fecha2 = new Date();
        System.out.println(fechasIguales(fecha1, fecha2));
        System.out.println(fecha1+"  || "+fecha2);
        
    }

    public static boolean fechasIguales(Date fecha1, Date fecha2){
        return fecha1.equals(fecha2);
        }
}
