package ies.puerto;

import java.util.Calendar;

public class Ejercicio10 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);
        if (verifica(diaSemana)) {
            System.out.println("Hoy "+calendario.getTime()+" Puedes descansar");
        }else{
            System.out.println("Hoy "+calendario.getTime()+" tienes que trabajar");
        }
        
    }
    public static boolean verifica(int dia){
        if ((dia == Calendar.SATURDAY)||(dia == Calendar.SUNDAY)) {
            return true;
        }
        return false;
    }
}
