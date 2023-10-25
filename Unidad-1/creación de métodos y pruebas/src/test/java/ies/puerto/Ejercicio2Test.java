package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    @Test
    public static void analizarNumeroTestOK() {
        Ejercicio2 ejercicio2 =new Ejercicio2();
        String resultado = Ejercicio2.analizarNumero(20);
        Assertions.assertEquals("" , resultado);
        //(frustracion, me estanque no sabia que hacer y lo deje)
    }
}
