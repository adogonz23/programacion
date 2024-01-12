package ies.puerto;
/**
 * Crea un paquete excepciones con una clase ValidacionException. Utiliza esta clase para lanzar y gestionar excepciones personalizadas 
 * en el paquete modelo al validar atributos de la clase Persona.
 */
public class ValidarExcepciones extends Exception {
    public ValidarExcepciones(String mensaje){
        super(mensaje);
    }
}
