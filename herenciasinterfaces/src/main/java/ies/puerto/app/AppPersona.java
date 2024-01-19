package ies.puerto.app;

import ies.puerto.abstracto.PersonaAbs;
import ies.puerto.impl.Alumno;
import ies.puerto.impl.Profesor;
import ies.puerto.interfaz.ITrabajador;

public class AppPersona {
    
    static ITrabajador profesor;
    static PersonaAbs alumno;

    public static void main(String[] args) {
    profesor =new Profesor("Jony",  "12-05-1990",  2335.45f,"profesor", "Programcion");
    alumno= new Alumno("Adonay", "03-12-1995", "1ºDam");
    System.out.println(alumno.toString());
    System.out.println(profesor.toString()); 
    }
}
