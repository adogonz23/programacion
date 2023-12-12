package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    
    Ejercicio3 ejercicio3 = new Ejercicio3();
    @Test
    public void  sumaDigitosOk(){
        int[] digitos={1,2,3,4,5};
        int resultado =15;
        int resultadoOK=ejercicio3.sumaDigitos(digitos);
        assertEquals(resultado, resultadoOK);
    }
    @Test
    public void digitosEnteroOk(){
        Integer numero= 12345;
        int[] digitosOk={1,2,3,4,5};
        int[] resultado=ejercicio3.digitosEntero(numero);
        assertArrayEquals(digitosOk,resultado);
    }
}
