package ies.puerto;
/**mplementa un programa que gestione las cuentas de un banco, teniendo en cuenta las siguientes consideraciones:

    La cuenta de ahorro tendrá las siguientes propiedades:
        String titular;
        double saldo;

Se pide:

    Implementa todos los constructores posiblems.
    Getters/Setters de las propiedades.
    Los siguientes métodos:
        Depositar un cantidad de dinero.
        Retirar una cantidad de dinero.
        informacion sobre el titular y la cantidad de dinero que tiene en ese momento en la cuenta.

 * @author adogonz23
 */
public class Estudiante {
    private String titular;
    private double saldo;

/**
 * Constructor por defecto;
 */
    public Estudiante(){

    }
    /**
     * Constructor con el parametro titular
     * @param titular nombre del titular
     */
    public Estudiante(String titular){
        this.titular=titular;
    }
    /**
     * Constructor con el parametro titular y saldo
     * @param titular nombre del titular
     * @param saldo dinero del titular
     */
    public Estudiante(String titular, double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void ingresarSaldo(double ingreso){
        double suma=0;
        suma = getSaldo()+ingreso;
        this.saldo=suma;
    }
    public void retirarSaldo(double retiro){
        double resta=0;
        resta=getSaldo()-retiro;
        this.saldo=resta;
    }  
    public String prinInfo(){
        return "El cliente: "+titular+" tiene un saldo de: "+saldo;
    }
}
