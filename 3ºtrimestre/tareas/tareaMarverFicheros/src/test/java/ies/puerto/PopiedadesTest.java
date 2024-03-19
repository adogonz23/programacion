package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertNotNull;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.config.FicheroProperties;

public class PopiedadesTest {
    FicheroProperties ficheroProperties;

    @BeforeEach
    public void beforeEach(){
        ficheroProperties= new FicheroProperties();
            
    }
    @Test
    public void notNull(){
        assertNotNull(ficheroProperties.obtenerPropiedades());
    }
}
