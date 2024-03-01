package ies.puerto;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void matrizTranspuestaOK() {
        int[][] matrizOriginal={{1,2,3},{4,5,6},{7,8,9}};
        int[][] resultado={{1,4,7},{2,5,8},{3,6,9}};
        int[][] resultadoOK= ejercicio6.hallarTranspuesta(matrizOriginal);
        assertArrayEquals(resultado, resultadoOK);

    } 



}
