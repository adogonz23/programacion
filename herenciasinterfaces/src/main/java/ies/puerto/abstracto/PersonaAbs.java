package ies.puerto.abstracto;

import java.time.LocalDate;
import java.time.Period;

public abstract class PersonaAbs {
    private String nombre;
    private String fechaNacimiento;
    
    public PersonaAbs() {
    }
    public PersonaAbs(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public int anios(){
        
        LocalDate fechanacimiente= LocalDate.parse(getFechaNacimiento());
        Period periodos = Period.between(fechanacimiente, LocalDate.now());
        int edad =periodos.getYears();
        

        return edad;

    }
    @Override
    public String toString(){
        return"";
    }
}
