package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {


    @Test
    public void calcularSueldoTestOK() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int resultado = Ejercicio1.calcularSueldo(10);

        Assertions.assertEquals((100),resultado);
   }
}
