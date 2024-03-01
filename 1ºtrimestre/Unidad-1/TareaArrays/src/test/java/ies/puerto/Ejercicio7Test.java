package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {
    Ejercicio7 ejercicio7= new Ejercicio7();
   

    @Test
    public void ordenarArrayOK(){
        int[]array= {3,6,1,5};
        int[]resultado= {1,3,5,6};
        int[]resultadoOK=ejercicio7.arrayOrdenado(array);
        assertArrayEquals(resultado, resultadoOK);
    }
    @Test
    public void ordenarArraynoOK(){
        int[]array= {3,6,1,5,10,7};
        int[]resultado= {1,3,5,6,7,10};
        int[]resultadoOK=ejercicio7.arrayOrdenado(array);
        assertArrayEquals(resultado, resultadoOK);
    }    
    // depende de la cantidad de valores que meta de da error o no, 

}
