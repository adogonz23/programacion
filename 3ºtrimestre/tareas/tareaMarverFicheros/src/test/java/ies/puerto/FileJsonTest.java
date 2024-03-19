package ies.puerto;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.entity.Personaje;
import ies.puerto.modelo.entity.interfaces.CrudFile;
import ies.puerto.modelo.file.implementacion.fileJson.FileJson;


public class FileJsonTest {
    CrudFile persistencia;
    List<Personaje>personajes;
    public final String MSN_ERROR="resultado no esperado";
    Personaje personaje;
    String nombre = "otroNombre";
    String alias= "otroAlias";
    String genero="otroGenero";
    String nombrePoder= "otroPoder";
    List<String> poderes;
    String nombre2 = "otroNombre2";
    String alias2= "otroAlia2s";
    String genero2="otroGenero2";
    String nombrePoder2= "otroPoder2";

    @BeforeEach
    public void beforeEach(){
        poderes= new ArrayList<>();
        poderes.add(nombrePoder);
        persistencia = new FileJson();
        personajes= persistencia.obtenerDatos();
        
    }
    @Test
    public void notNull(){
        Assertions.assertNotNull(personajes, MSN_ERROR);
    }
    @Test
    public void escribirFicheroTest(){
        persistencia.escribirFichero( personajes);
        
    }
}
