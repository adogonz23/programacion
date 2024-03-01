package ies.puerto.modelo.entity;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import ies.puerto.modelo.abstractas.ArticuloFresco;

public class Alimento extends ArticuloFresco{
    public Alimento(String id, String nombre,
                    float precio, String fCaducidad, String fEntrada) {
        super(id, nombre, precio, fCaducidad, fEntrada);
    }
    
/**
 * Mejorable
 */
    @Override
    public int diasCaducidad() {
        if (esCaducado()) {
            return 0;
        }
        return calculaPeriod().getDays();
    }
    
    @Override
    public boolean esCaducado() {
        return calculaPeriod().isNegative();
    }
    @Override 
    public float precioMaximo(){
        return getPrecio()* 1.35f;
    }
    public Period calculaPeriod(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaCaducidad = LocalDate.parse(getfCaducidad(), formato);
        return Period.between(fechaActual, fechaCaducidad);
    
    }
}
