package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2= new Ejercicio2();
    char[] vocales={'a','e','i','o','u'};
    @Test
    public  void contarvocalesOK(){
        String frase="hola mundo";
        int resultado= 4;
        int resultadoOK= ejercicio2.contarVocales(frase, vocales);
        Assertions.assertEquals(resultado, resultadoOK);
    }
    @Test
    public void sinVocales(){

        String frase="hhhhhhhhhhhhhhhhhhhhhh";
        int resultado=0;
        int resultadoOK=ejercicio2.contarVocales(frase,vocales);
        assertEquals(resultado,resultadoOK);

    }
}
