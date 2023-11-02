package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Ejercicio9Test {
Ejercicio9 ejercicio9= new Ejercicio9();
    @Test
    public void combinaArraysOK() {
        int[]array1={1,2,3};
        int[]array2={4,5,6};
        int[]resultado= {1,2,3,4,5,6};
        int[]resultadoOK=ejercicio9.combinaArrays(array1, array2);
        assertArrayEquals(resultado, resultadoOK);

    }
}
