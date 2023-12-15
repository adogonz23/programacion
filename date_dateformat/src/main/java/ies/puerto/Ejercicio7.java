package ies.puerto;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        Date fecha1 = calendario.getTime();
        calendario.set(1995,11,03);
        Date fecha2 = calendario.getTime();
        System.out.println("entre "+fecha1+" y "+fecha2+" hay "+diferenciaFechas(fecha1, fecha2)+" dias de diferencia");
        
    }
 
    public static int diferenciaFechas(Date fecha1, Date fecha2){
        
        int diferencia = 0;
        if (fecha1.equals(fecha2)) {
            return diferencia;
        }else if (fecha1.after(fecha2)) {
            diferencia= (int) (fecha1.getTime()-fecha2.getTime()) /86400000;
            
        }else{
        diferencia= (int) (fecha2.getTime()-fecha1.getTime())/86400000;
        }
        return diferencia;

    }

}
