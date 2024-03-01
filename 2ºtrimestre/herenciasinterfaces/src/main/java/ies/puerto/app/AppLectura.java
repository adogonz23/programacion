package ies.puerto.app;

import ies.puerto.abstracto.LecturaDatosAbs;

import ies.puerto.impl.LecturaDatosBD;

public class AppLectura {
    static LecturaDatosAbs lecturaDatos;
    public static void main(String[] args) {
        lecturaDatos=new LecturaDatosBD();
        System.out.println(lecturaDatos.apertura());
        System.out.println(lecturaDatos.lectura());
        System.out.println(lecturaDatos.cierre());
        tipo(lecturaDatos);
    }

    public static void tipo (LecturaDatosAbs lecturaDatos){
        System.out.println(lecturaDatos.getClass().getName());
    }
    
}
