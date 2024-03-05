package es.ies.puerto.modelo.File;


import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.file.FileCsv;

public class FileCsvTest {
    public final  String  SMSTEST = "el resultado no es el esperado";
    List<Persona> personas;
    FileCsv fileCsv;

    @BeforeEach
    public void  beforeEach(){
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
        2,SMSTEST);
        Assertions.assertNotNull(personaBuscar.getNombre(),SMSTEST);
        Assertions.assertTrue(personaBuscar.getEdad()>0,SMSTEST);
        Assertions.assertNotNull(personaBuscar.getEmail(),SMSTEST);
    }
    @Test
    public void addPerson(){
        int id = 5;
        String nombre= "otroNombre";
        int edad =14;
        String email = "otroEmail";
        Persona persona2 = new Persona(id, nombre, edad, email);
        fileCsv.addPerson(persona2);
        Assertions.assertTrue(fileCsv.readAll().contains(persona2), SMSTEST);
    }
    @Test
    public void deletePersonTest(){
        int id =6;
        Persona persona = new Persona(id);
        fileCsv.deletePerson(id);
        Assertions.assertFalse(fileCsv.readAll().contains(persona),SMSTEST);
    }

}
