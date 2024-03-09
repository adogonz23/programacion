package ies.puerto.modelo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.entity.Persona;
import ies.puerto.modelo.file.xml.implementacion.FileXml;
import ies.puerto.modelo.interfaces.CRUDoperaciones;

public class FileXMLTest {
    CRUDoperaciones persistencia;
    int edad2= 99;
    String nombre="otro";
    String email= "otro@email";
    List<Persona>personas;
    final String MSN_ERROR="El resultado no es el esperado";
    @BeforeEach
    public void beforeEach(){
        persistencia=new FileXml();
        personas= persistencia.obtenerDatos(persistencia.getRUTA_FICHERO());
    }
    @Test
    public void notNull(){
        Assertions.assertNotNull(personas);
    }
    @Test
    public void ObternerPersonaTest(){
        Persona persona= persistencia.obtenerPersona(2,persistencia.getRUTA_FICHERO());
        Assertions.assertEquals(persona.getEdad(), edad2,MSN_ERROR);
    }
    @Test
    public void añadirPersona(){
        Persona persona2= new Persona(12, "ado", 28, "mail...");
        persistencia.añadirPersona(persona2,persistencia.getRUTA_FICHERO());
        personas=persistencia.obtenerDatos(persistencia.getRUTA_FICHERO());
        Assertions.assertTrue(personas.contains(persona2),MSN_ERROR);
    }
    @Test
    public void EliminarPersonaTest(){
        Persona persona2= new Persona(12, "ado", 28, "mail...");
        persistencia.eliminarPersonas(persona2, persistencia.getRUTA_FICHERO());
        personas=persistencia.obtenerDatos(persistencia.getRUTA_FICHERO());
        Assertions.assertFalse(personas.contains(persona2),MSN_ERROR);
    }
    @Test
    public void actualizarPersonaTest(){
        Persona persona2= new Persona(2, "ado", 28, "mail...");
        persistencia.actualizarPersona(persona2);
        persistencia.obtenerDatos(persistencia.getRUTA_FICHERO());
        Assertions.assertEquals(persistencia.obtenerPersona(2, persistencia.getRUTA_FICHERO()), persona2);
    }
}
