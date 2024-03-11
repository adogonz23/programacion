package ies.puerto;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.entity.Personaje;
import ies.puerto.modelo.file.implementacion.fileCsv.FileCsv;

public class FileCsvTest {
    FileCsv fileCsv;
    List<Personaje>personajes;
    public final String MSN_ERROR="resultado no esperado";

    @BeforeEach
    public void beforeEach(){
        fileCsv = new FileCsv();
        personajes= fileCsv.obtenerDatos();
    }
    @Test
    public void notNull(){
        Assertions.assertNotNull(personajes, MSN_ERROR);
    }
    @Test
    public void escribirFicheroTest(){
        fileCsv.escribirFichero( personajes);
        
    }
}
