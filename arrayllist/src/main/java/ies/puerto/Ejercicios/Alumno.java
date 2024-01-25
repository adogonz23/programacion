package ies.puerto.Ejercicios;

import java.util.List;



/**
 * Implementa una clase Alumno con atributos como nombre, apellido y calificaciones (un ArrayList de float). 
 * Crea instancias de esta clase para representar a varios alumnos y calcula el promedio de calificaciones. a la lista.
 * Crea un programa que demuestre el comportamiento correcto del programa App+NombreIdentificativo, o test unitarios que sistituyen a este.
 */
public class Alumno {
    private String nombre;
    private String apellidos;
    private List<Float> calificaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Float> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Float> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Alumno(List<Float> calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Alumno(String nombre, String apellidos, List<Float> calificaciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calificaciones = calificaciones;
    }
    


    public float media(){
        float notamedia=0;
        if (calificaciones.size()==0) {
            return 0;
        }
        for (Float calificacion : calificaciones) {
            notamedia=notamedia+calificacion;
        }
        return notamedia/ calificaciones.size();
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno other = (Alumno) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

   
  
}
