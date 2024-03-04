package es.ies.puerto.modelo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
    int id = 1;
        String nombre = "nombre";
        int edad= 12;
        String email = "test@email.com";
        Persona  persona;
    @BeforeEach
    public void BeforeEach(){
        persona = new Persona(id, nombre, edad, email);
        
    }
    @Test
    public void createPersonaTEst(){
        Assertions.assertNotNull(persona,"El objeto no puede ser nulo");
    }
    @Test
    public void toStringTest(){
        Assertions.assertTrue(persona.toString().contains(String.valueOf(id)));
        Assertions.assertTrue(persona.toString().contains(nombre));
        Assertions.assertTrue(persona.toString().contains(String.valueOf(edad)));
        Assertions.assertTrue(persona.toString().contains(email));
    }
    @Test
    public void equalsPersonaTest(){
        Persona personaBuscar = new Persona(id);
        Assertions.assertEquals(personaBuscar, persona, "el objeto debe ser igual");
    }
    @Test
    public void toCsvPersona(){
        Assertions.assertTrue(persona.toCSV().contains(String.valueOf(id)));
        Assertions.assertTrue(persona.toCSV().contains(nombre));
        Assertions.assertTrue(persona.toCSV().contains(String.valueOf(edad)));
        Assertions.assertTrue(persona.toCSV().contains(email));
        Assertions.assertTrue(persona.toCSV().contains(persona.DELIMITADOR));
    }
    
}

