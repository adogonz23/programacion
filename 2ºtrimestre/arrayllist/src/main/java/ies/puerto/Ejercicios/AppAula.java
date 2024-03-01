package ies.puerto.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppAula {
    static Clase dam1;
    

    public static void main(String[] args) {
        dam1= new Clase("1ºDAM");
        Alumno alumno1= new Alumno("adonay", "Gonzalez",Arrays.asList(1f,2f,6f,4f));
        Alumno alumno2= new Alumno("maxi", "Emilio",Arrays.asList(7f,9f,6f,9f));
        List<Alumno> alumnos= new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        dam1.setAlumnos(alumnos);
        System.out.println("media aula  "+dam1.media());
    }
}
