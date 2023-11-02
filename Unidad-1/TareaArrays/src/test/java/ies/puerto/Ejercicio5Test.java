package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5 = new Ejercicio5();
    @Test
    public void valorEspecificoOK() {
        int[]array={14,17,46,4,9};
        int valorDado= 9;
        int resultado=4;
        int resultadoOK= ejercicio5.valorEspecifico(array, valorDado); 
        assertEquals(resultado, resultadoOK);  
    }
    @Test
    public void valorEspecificoNoOK() {
        int[]array={14,17,46,4,9};
        int valorDado= 1;
        int resultado=-1;
        int resultadoOK= ejercicio5.valorEspecifico(array, valorDado); 
        assertEquals(resultado, resultadoOK);  
    }
}
