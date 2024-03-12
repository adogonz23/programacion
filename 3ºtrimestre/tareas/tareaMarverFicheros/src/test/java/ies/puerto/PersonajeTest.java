package ies.puerto;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import ies.puerto.modelo.entity.Personaje;


public class PersonajeTest {
    Personaje personaje;
    String nombre = "otroNombre";
    String alias= "otroAlias";
    String genero="otroGenero";
    List<String>poderes;
    String nombrePoder= "otroPoder";

    public final String MSN_ERROR="resultado no esperado";

    @BeforeEach
    public void beforeEach (){
        poderes = new ArrayList<>();
        poderes.add(nombrePoder);
        personaje = new Personaje(nombre, alias, genero, poderes);
    }
    @Test
    public void notNull(){
        Assertions.assertNotNull(personaje,MSN_ERROR);
        Assertions.assertNotNull(poderes,MSN_ERROR);
    }
    @Test
    public void equalsTEst(){
        Assertions.assertTrue(personaje.getPoderes().contains(nombrePoder));
    }
    @Test
    public void toStringTest(){
        Assertions.assertTrue(personaje.toString().contains(personaje.getNombre()),MSN_ERROR);
        Assertions.assertTrue(personaje.toString().contains(personaje.getAlias()),MSN_ERROR);
        Assertions.assertTrue(personaje.toString().contains(personaje.getGenero()),MSN_ERROR);
        Assertions.assertTrue(personaje.toString().contains(nombrePoder),MSN_ERROR);
    }
    @Test
    public void setTest(){
        personaje.setAlias(alias);
        personaje.setGenero(genero);
        personaje.setNombre(nombre);
        personaje.setPoderes(poderes);
    }
    @Test
    public void hascodeTest(){
        Assertions.assertEquals(personaje.hashCode(), personaje.hashCode());
    }
}
