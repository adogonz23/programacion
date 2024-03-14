package es.ies.puerto.ejercicio.seis;

public class Bisiesto {
    public boolean is(int anio) {
        if ((anio %4 ==0 && anio % 10==0)|| anio %400==0) {
            return true;
        }


        return false;
    }
}
