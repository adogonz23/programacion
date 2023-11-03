package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    Persona persona1= new Persona( "Adonay",22,"adogonzalez75@gmail.com", "644355624");
    @Test
    public void imprimir2Ok(){
        String resultado="Nombre: Adonay edad: 22 email: adogonzalez75@gmail.com telefono: 644355624";
        String resultadoOK= persona1.imprimir2();
        assertEquals(resultado,resultadoOK);
    }
    
}
