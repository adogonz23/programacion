package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NotasTest {
    Notas notas1 = new Notas(5.0);
    
    @Test
    public void notasTestOK(){
        String resultado= "aprovado";
        String resultadoOK= notas1.calificacion(5);
        assertEquals(resultado,resultadoOK);
    }
}


