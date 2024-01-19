package ies.puerto.interfaz;
/**
 * Crea una interfaz IInstrumentoMusical con dos métodos: tocarNota(String nota) y afinar(). 
 * Luego, implementa la interfaz en una clase Guitarra que proporciona implementaciones concretas para ambos métodos (Tocar nota de guitarra y afinada la guitarra respectivamente). 
 * Además, agrega un método adicional cambiarCuerdas() que sea específico de la clase Guitarra.
 */
public interface IInstrumentoMusical {
    public String tocaNota(String nota);
    public String Afinar();
    
}
