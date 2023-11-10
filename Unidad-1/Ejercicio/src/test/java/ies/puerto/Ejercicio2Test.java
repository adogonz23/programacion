package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();
    @Test
    public void comparacionArrays(){
        int[]array={2,4,7,5};
        int[]resultado={2,4,5,7};
        int[]resultadoOk= ejercicio2.compararElementos(array);
        assertArrayEquals(resultado, resultadoOk);

    } 
}
