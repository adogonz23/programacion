package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3= new Ejercicio3();
    @Test
    public void valorMaximoOK() {
        int[]array={5,6,2,14,89};
        int resultado= 89;
        int resultadoOk= ejercicio3.valorMaximo(array);
        assertEquals(resultado,resultadoOk);

    }
    @Test
    public void valorMinimoOK(){
       int[]array={5,6,2,14,89};
        int resultado= 2;
        int resultadoOk= ejercicio3.valorMinimo(array);
        assertEquals(resultado,resultadoOk); 

    }
}
