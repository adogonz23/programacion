package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EstudianteTest {
    
    Estudiante estudiante1 = new Estudiante("Adonay", 2000.0);
    @Test
    public void testDeTodoOk(){
        estudiante1.ingresarSaldo(1000.0);
        estudiante1.retirarSaldo(2000.0);
        String resultado="El cliente: Adonay tiene un saldo de: 1000.0";
        String resultadoOk= estudiante1.prinInfo();
        assertEquals(resultado, resultadoOk);
    }
}
