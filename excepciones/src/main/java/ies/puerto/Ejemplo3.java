package ies.puerto;

import java.io.File;

public class Ejemplo3 {
    public static void main(String[] args) {
        System.out.println("hola");

        File archivo = new File("Archivo.txt");
        System.out.println("voy a generar un nullPointer"+archivo.getName());
    }
}
