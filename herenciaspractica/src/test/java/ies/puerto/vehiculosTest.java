package ies.puerto;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class vehiculosTest {
    
    static Coche coche1;
    static Motocicleta moto1;

    
    @Test
    public void herenciaOk(){
        coche1=new Coche("Seat", "panda", 1000.0f, "4X4");
        moto1=new Motocicleta("Kawasaki", "ninja", 6000);
        String resultadoCoche= "El modelo :panda pertenece a la marca :Seat y tiene un precio de 1000.0";
        String resultadoOKCoche= coche1.toString();
        assertEquals(resultadoCoche, resultadoOKCoche);

    }
}
