package ies.puerto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Ejemplo 1: Excepción Verificada (FileNotFoundException)
 */
public class Ejemplo1 {
    public static void main(String[] args)  {
        System.out.println("a");
    try{
        File  archivo = new File("Archivo.txt");
        FileReader lector= new FileReader(archivo);
        }catch(FileNotFoundException exception){
            System.out.println("es una exception aritmetic");
        }
    }
}
