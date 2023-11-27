package ies.puerto;
/** Crea una excepción personalizada llamada NumeroNegativoException que se lance cuando un método recibe un número negativo como argumento. Luego, implementa una clase que contenga un método que acepte un número y lance esta excepción si es negativo.
 * @author adogonz23
 */
public class NumeroNegativoException  extends Exception{   
    private int numeroError;

    public NumeroNegativoException(int numero) {
        this.numeroError = numero;
    }

    public NumeroNegativoException(String message, int numero) {
        super(message);
        this.numeroError= numero;
    }
    public NumeroNegativoException(String message){
        super(message);
    }

}
