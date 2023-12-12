package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    
    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public  void invertirOK(){
        
        String frase="Adonay";
        String resultado="yanodA";
        String resultadoOK= ejercicio1.invertirString(frase);
        Assertions.assertEquals(resultado, resultadoOK);
    }
}
