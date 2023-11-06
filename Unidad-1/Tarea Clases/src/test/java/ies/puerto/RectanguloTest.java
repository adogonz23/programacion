package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectanguloTest {
    Rectangulo rectangulo1= new Rectangulo(1, 5);
    @Test  
    public void testAreaOk(){
        double resultadoArea= 2.5;
        double resultadoAreaOK= rectangulo1.hallarArea();
        assertEquals(resultadoArea, resultadoAreaOK);

    }
    @Test  
    public void testPerimetroOk(){
        double resultadoP= 12;
        double resultadoPOk= rectangulo1.hallarPerimetro();
        Assertions.assertEquals(resultadoP, resultadoPOk, "me equivoque....");

    }
}
