package ies.puerto.app;

import ies.puerto.impl.ReproductorMP3;

public class Appreproductor {
    static ReproductorMP3 reproductorMP3;
    public static void main(String[] args) {
        reproductorMP3= new ReproductorMP3("reproduciendo");
        reproductorMP3.detener();
        System.out.println(reproductorMP3);
    }
}
