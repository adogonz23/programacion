package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void promedioArrayOK(){
        float[]array={1f,2f,3f,4f,5f};
        float resutado= 3;
        float resultadoOk = ejercicio2.promedioArray(array);
        assertEquals(resutado, resultadoOk);

    }


}
