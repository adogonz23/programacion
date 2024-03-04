package es.ies.puerto.modelo;

import es.ies.puerto.utilidades.Utilidades;

public class Persona extends Utilidades{
    
    int id;
    String nombre;
    int edad;
    String email;

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


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Constructor con todos los poarametros
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


    /**
     * Constructor con id
     * @param id
     */
    public Persona (int id ){
        this.id = id;
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


    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
    }
    
    public String toCSV(){
        return id+DELIMITADOR+nombre+DELIMITADOR+edad+DELIMITADOR+email;
    }
}
