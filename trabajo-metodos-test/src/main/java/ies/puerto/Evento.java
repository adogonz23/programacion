package ies.puerto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;



/**
 * @author adogonz23            
 */
public class Evento {
    private String nombre;
    private String fecha;
    
    

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        SimpleDateFormat formatoFecha= new SimpleDateFormat("dd/MM/aaaa");
        fecha=formatoFecha.format(fecha);
    
        
    }
    /**
     * Constructor por defecto
     */
    public Evento() {
    }
    /**
     * Constructor con los atributos de fecha y nombre
     * @param nombre
     * @param fecha
     */
    public Evento(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }
    
    public String infoEvento(){
        String informacion="El evento :"+nombre+"se relalizara a fecha de :"+fecha;
        return informacion;
    }

    
}
