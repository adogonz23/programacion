package ies.puerto.modelo.entity;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Persona {
    @Element
    private int id;
    @Element
    private String nombre;
    @Element
    private int edad;
    @Element( name = "correo")
    private String email;
    public final String DELIMITADOR=",";
    /**
     * Consrtructor por defecto
     */
    public Persona() {
    }
    /**
     * Constructor con id
     */
    public Persona(int id) {
        this.id = id;
    }
    /**
     * Constructor con todos los parametros
     * @param id
     * @param nombre
     * @param edad
     * @param email
     */
    public Persona(int id, String nombre, int edad, String email) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }
    public int getId() {
        return id;
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
    public void setedad(int edad) {
        this.edad = edad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
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
        if (id != other.id)
            return false;
        return true;
    }
    public String toCsv(){
        return id+DELIMITADOR+nombre+DELIMITADOR+edad+DELIMITADOR+email;
    }
}
