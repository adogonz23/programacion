package ies.puerto.impl;

import ies.puerto.abstracto.PersonaAbs;

public class Alumno extends PersonaAbs{

    private String nivel;

    public Alumno() {
    }

    public Alumno(String nivel) {
        this.nivel = nivel;
    }

    public Alumno(String nombre, String fechaNacimiento, String nivel) {
        super(nombre, fechaNacimiento);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public void estudiar(){

    }
    @Override
    public String toString(){
        return"El alumno: "+getNombre()+", con fecha de nacimiento: "+getFechaNacimiento()+", estudia: "+nivel;
    }
}
