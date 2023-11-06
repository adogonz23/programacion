package ies.puerto;
/**
 * @author adogonz23
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private String nombreTitular;
    private double saldo;
    /**
     * constructor cliente
     * @param nombreTitular
     * @param saldo
     */
    public CuentaBancaria(String nombreTitular, double saldo) { 
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }
    /**
     * Constructor mostrar todo
     * @param numeroCuenta
     * @param nombreTitular
     * @param saldo
     */
    public CuentaBancaria(int numeroCuenta, String nombreTitular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     *  metodo que nos devuelve el saldo depues de añadir un deposito
     * @param deposito cantidad a añadir
     */
    public void realizarIngreso(double deposito){
        double suma=0.0;
        suma=deposito+getSaldo();
        this.saldo= suma;
    }
    
    /**
     *  metodo que nos permite hacer un retiro y setear el nuevo saldo
     * @param retiro cantidad de dinero a retiar
     * 
     */
    public void realizarRetiro(double retiro){
        double resta=0;
        if (retiro<getSaldo()) {
            resta= getSaldo()-retiro;
            this.saldo=resta;    
        }
    }
    public String printInfo(){
        return "el cliente "+nombreTitular+" tiene un saldo de = "+saldo;
    }


}
