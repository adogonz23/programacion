package ies.puerto.impl;

import ies.puerto.abstracto.EmpleadoAbs;


public class Profesor extends EmpleadoAbs{

    private String especialidad;

    public Profesor(String trabajo, String especialidad) {
        super(trabajo);
        this.especialidad = especialidad;
    }

    public Profesor(float salario, String especialidad) {
        super(salario);
        this.especialidad = especialidad;
    }

    public Profesor(float salario, String trabajo, String especialidad) {
        super(salario, trabajo);
        this.especialidad = especialidad;
    }

    public Profesor(String nombre, String fechaNacimiento, float salario, String especialidad) {
        super(nombre, fechaNacimiento, salario);
        this.especialidad = especialidad;
    }

    public Profesor(String nombre, String fechaNacimiento, String trabajo, String especialidad) {
        super(nombre, fechaNacimiento, trabajo);
        this.especialidad = especialidad;
    }

    public Profesor(String nombre, String fechaNacimiento, float salario, String trabajo, String especialidad) {
        super(nombre, fechaNacimiento, salario, trabajo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String trabajar() {
        
        return null;
    }
    public void claculaSalario(){
        
    }
    @Override
    public String toString(){
        return getNombre()+",nacido el: "+getFechaNacimiento()+" trabaja de: "+getTrabajo()+", especializado en: "+getEspecialidad()+" y tiene un sueldo de "+getSalario()+"€";
    }
    public void impartirClase(){

    }










    
}
