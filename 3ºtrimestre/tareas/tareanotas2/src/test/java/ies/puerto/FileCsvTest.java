package ies.puerto;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.entity.Persona;
import ies.puerto.modelo.file.FileCsv;

public class FileCsvTest {
    FileCsv filecsv;
    List<Persona>personas;
    String path = "src/resources/datos.csv";
    String nombre="otro nombre";
    int edad=3;
    String ciudad= "Levante";
    Persona persona;
    @BeforeEach
    public void beforeEach(){
        filecsv = new FileCsv();
        personas= filecsv.obtenerDatos(path);
    }
    @Test
    public void notNull(){
        Assertions.assertNotNull(personas);
    }
    @Test
    public void escribirFicheroTest(){
        Assertions.assertTrue(filecsv.escribirFichero(path, personas));
    }
    @Test
    public void aññadirPErsonaTEst(){
        persona= new Persona(nombre, edad, ciudad);
        Assertions.assertTrue(filecsv.añadirPersona(path, persona));
    }
    
}
