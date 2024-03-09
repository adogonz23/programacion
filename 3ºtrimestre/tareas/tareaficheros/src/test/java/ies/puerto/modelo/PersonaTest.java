package ies.puerto.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.entity.Persona;

public class PersonaTest {
    int id= 8;
    String nombre ="otronombre";
    int edad =10;
    String email = "otroemail@gmail.com";
    Persona persona;
    final String MSN_ERROR="El resultado no es el esperado";
    @BeforeEach
    public void beforeEach(){
        persona= new Persona(id, nombre, edad, email);

    }
    @Test
    public void  notNull(){
        Assertions.assertNotNull(persona,MSN_ERROR);
    }
    @Test
    public void toStringTEst(){
        Assertions.assertTrue(persona.toString().contains(nombre),MSN_ERROR);
        Assertions.assertTrue(persona.toString().contains(String.valueOf(id)),MSN_ERROR);
        Assertions.assertTrue(persona.toString().contains(email),MSN_ERROR);
        Assertions.assertTrue(persona.toString().contains(String.valueOf(edad)),MSN_ERROR);

    }
    @Test
    public void toCsvTEst(){
        Assertions.assertTrue(persona.toCsv().contains(nombre),MSN_ERROR);
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(id)),MSN_ERROR);
        Assertions.assertTrue(persona.toCsv().contains(email),MSN_ERROR);
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(edad)),MSN_ERROR);
        
    }
    @Test
    public void getSetTes(){
        String nombre2 ="otronombre2";
        int edad2 =12;
        String email2 = "otroemail2@gmail.com";
        persona.setNombre(nombre2);
        persona.setEmail(email2);
        persona.setedad(edad2);
        Assertions.assertEquals(persona.getEmail(), email2, MSN_ERROR);
        Assertions.assertEquals(persona.getNombre(), nombre2, MSN_ERROR);
        Assertions.assertEquals(persona.getEdad(), edad2, MSN_ERROR);
    }


}
