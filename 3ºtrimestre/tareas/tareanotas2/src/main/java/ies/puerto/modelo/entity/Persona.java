package ies.puerto.modelo.entity;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import ies.puerto.utilidades.Utilidades;
@Root (name = "persona")
public class Persona extends Utilidades{
    @Element
    private String nombre;
    @Element
    private int edad;
    @Element
    private float nota;
    @Element
    private String ciudad;
    
   
    public Persona() {
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    public Persona(String nombre, int edad, float nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }
    public Persona(String nombre, int edad, float nota, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.ciudad = ciudad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + ", ciudad=" + ciudad + "]";
    }
    public String toCsvDatos(){
        return nombre+DELIMITADOR+edad+DELIMITADOR+ciudad;
    }
    public String toCsvNotas(){
        return nombre+DELIMITADOR+edad+DELIMITADOR+nota;
    }
}
