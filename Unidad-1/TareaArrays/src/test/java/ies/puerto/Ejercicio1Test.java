package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void sumaraArrayOK(){
        int [] array={1,2,3,4,5};
        int resutado= 15;
        int resultadoOk= Ejercicio1.sumaArray(array);
        assertEquals(resutado,resultadoOk);


    }
}
