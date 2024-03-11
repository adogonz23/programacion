package ies.puerto.modelo.entity;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Poder {
    @Element
    private String nombre;

    public Poder() {
    }

    public Poder(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
