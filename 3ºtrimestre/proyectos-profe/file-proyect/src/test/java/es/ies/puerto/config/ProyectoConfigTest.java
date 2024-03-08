package es.ies.puerto.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoConfigTest {
    ConfigProyecto configProyecto;
    final String MSN_ERROR="REsultado no esperado";
    @BeforeEach
    public void beforeEcahc(){
        configProyecto= new ConfigProyecto();
    }
    @Test
    public void getPropertiesTest(){
        Assertions.assertNotNull(configProyecto.bundle,MSN_ERROR);
        Assertions.assertNotNull(configProyecto.bundle.keySet(),MSN_ERROR);
    }
    @Test
    public void greetinFerawellTEst(){
        Assertions.assertNotNull(configProyecto.bundle.getObject("greeting"),MSN_ERROR);
        Assertions.assertNotNull(configProyecto.bundle.getObject("farewell"),MSN_ERROR);
    }
    @Test
    public void laguageEsTest(){
        String mensaje= (String)  configProyecto.bundle.getObject("greeting");
        Assertions.assertEquals(mensaje,"¡Hola!",MSN_ERROR);
        mensaje = (String) configProyecto.bundle.getObject("farewell");
        Assertions.assertEquals(mensaje,"¡Adiós!",MSN_ERROR);
    }
    @Test
    public void laguageEnTest(){
        configProyecto.languageEn();
        String mensaje= (String)  configProyecto.bundle.getObject("greeting");
        Assertions.assertEquals(mensaje,"Hello!",MSN_ERROR);
        mensaje = (String) configProyecto.bundle.getObject("farewell");
        Assertions.assertEquals(mensaje,"Goodbye!",MSN_ERROR);
    }
}
