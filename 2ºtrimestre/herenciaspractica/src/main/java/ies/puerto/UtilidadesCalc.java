package ies.puerto;
/**
 * 
    Crea un paquete llamado utilidades y dentro de él una clase llamada UtilidadesCal con métodos para realizar operaciones matemáticas básicas 
    como suma, resta, multiplicación y división.
    Crea la clase Calculadora que haga uso de UtilizadasCal a través de herencia.

 */
public class UtilidadesCalc {

    public int suma(int valor1, int valor2){
        int resultado= valor1 + valor2;
        return resultado;
    }
    public int resta(int valor1, int valor2){
        int resultado= valor1 - valor2;
        return resultado;
    }
    public int multiplicacion(int valor1, int valor2){
        int resultado= valor1 * valor2;
        return resultado;
    }
    public int division(int valor1, int valor2){
        int resultado= valor1 / valor2;
        return resultado;
    }

}
