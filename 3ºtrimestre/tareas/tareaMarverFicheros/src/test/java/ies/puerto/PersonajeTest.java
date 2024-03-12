package ies.puerto;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import ies.puerto.modelo.entity.Personaje;
import ies.puerto.modelo.entity.Poder;

public class PersonajeTest {
    Personaje personaje;
    String nombre = "otroNombre";
    String alias= "otroAlias";
    String genero="otroGenero";
    List<Poder>poderes;
    String nombrePoder= "otroPoder";
    Poder poder ;
    public final String MSN_ERROR="resultado no esperado";

    @BeforeEach
    public void beforeEach (){
        poder= new Poder(nombrePoder);
        poderes = new ArrayList<>();
        poderes.add(poder);
        personaje = new Personaje(nombre, alias, genero, poderes);
    }
    @Test
    public void notNull(){
        Assertions.assertNotNull(personaje,MSN_ERROR);
        Assertions.assertNotNull(poder,MSN_ERROR);
        Assertions.assertNotNull(poderes,MSN_ERROR);
    }
    @Test
    public void equalsTEst(){
        Assertions.assertTrue(personaje.getPoderes().contains(poder));
    }
}
