package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ejercicio8Test {
Ejercicio8 ejercicio8 = new Ejercicio8();
    @Test
    public void contadorOK() {
        
        int[]array= {4,1,13,13,5,5,8};
        int resultado = 2;
        int resultadoOK= ejercicio8.DetectarIguales(array);
        assertEquals(resultado,resultadoOK);

    }
    @Test
    public void copiaIgualesOK(){
        int[]array= {4,1,13,13,5,5,8};
        int[]resultado= {0,0,0,0,0,5,13};
        int[]resultadoOk= ejercicio8.copiaIguales(array);
        assertArrayEquals(resultado,resultadoOk);
    }
}
