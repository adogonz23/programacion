package es.ies.puerto.file;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.file.FileCsv;

public class FileCsvTest {
    
    List<Persona> personas;
    FileCsv fileCsv;

    @BeforeEach
    public void  BeforeEach(){
        fileCsv = new FileCsv();
        personas=fileCsv.readAll();
    }
    @Test
    public void readAllTest(){
        personas = fileCsv.readAll();
        Assertions.assertFalse(personas.isEmpty());
    }
    @Test 
    public void getPersonTest(){
        Persona personaBuscar = new Persona(2);
        personaBuscar = fileCsv.getPerson(personaBuscar);
        Assertions.assertEquals(personaBuscar.getId(),
        2,"no se ha obetenido el resultado esperrado");
        Assertions.assertNotNull(personaBuscar.getNombre(),"no se ha obetenido el resultado esperado");
        Assertions.assertTrue(personaBuscar.getEdad()>0,"no se ha obetenido el resultado esperrado");
        Assertions.assertNotNull(personaBuscar.getEmail(),"no se ha obetenido el resultado esperrado");
    }
    @Test
    public void addPerson(){
        
    }
}
