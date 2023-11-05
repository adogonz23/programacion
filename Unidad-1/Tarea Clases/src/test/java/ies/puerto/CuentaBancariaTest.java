package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {
    CuentaBancaria cliente1 = new CuentaBancaria("Adonay Gonzalez", 1500.0);
    @Test
    public void ingresosTest(){
    //double ingreso =500.0;
    //double resultado = 2000.0;
    //double resultadoOK= cliente1.realizarIngreso1(ingreso);
    //assertEquals(resultado, resultadoOK);
    }
    @Test
    public void realizarRetiroOK(){
        //double retiro=1000.0;
        //double resultado= 500.0;
        //double resultadoOK= cliente1.realizarRetiro1(retiro);
        //assertEquals(resultado, resultadoOK);
    }
    @Test
    public void todoOK(){
        double ingreso=1000.0;
        double retiro=2000.0;
        cliente1.realizarIngreso(ingreso);
        cliente1.realizarRetiro(retiro);
        String resultado= "el cliente Adonay Gonzalez tiene un saldo de = 500.0";
        String resultadoOK= cliente1.printInfo();
        assertEquals(resultado, resultadoOK);

    }
}
