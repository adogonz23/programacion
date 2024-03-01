package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CirculoTest {
    Circulo circulo1 =new Circulo(4.0);
    Circulo ciruclo2 = new Circulo(1.0);
    @Test
    public void MetodosOK(){
        String resultado="Un circulo con radio4.0 tiene un area de =50.24 y una circunferencia de =25.12";
        String resultadoOK= circulo1.impriomirInfo();
        assertEquals(resultado, resultadoOK);
    }
    @Test
    public void cambiarRadioOK(){
        ciruclo2.cambiarRadio(4.0);
        String resultado="Un circulo con radio4.0 tiene un area de =50.24 y una circunferencia de =25.12";
        String resultadoOK= ciruclo2.impriomirInfo();
        assertEquals(resultado, resultadoOK);

    }
}
