package ies.puerto.Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Clase {
    
    private String identificador;

    private List<Alumno>alumnos;
    
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    public Clase(String identificador) {
        this.identificador = identificador;
        this.alumnos = new ArrayList<>();
    }
    public Clase(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    public Clase(String identificador, List<Alumno> alumnos) {
        this.identificador = identificador;
        this.alumnos = alumnos;
    }

    public float media(){
        float resultado=0;
        if (alumnos.isEmpty()) {
            return resultado;
        }
        for (Alumno alumno:alumnos){
            resultado= resultado+alumno.media();
        }
        return resultado/alumnos.size();
    }
}
