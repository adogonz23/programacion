package ies.puerto;
/**
 * Crea una clase Vehiculo con atributos como marca, modelo y precio. Crea clases Coche y Motocicleta que hereden de Vehiculo y 
 * añadan atributos específicos y relaciones con otras clases como Conductor.
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;
    
    public Vehiculo(){

    }
    public Vehiculo(float precio) {
        this.precio = precio;
    }
    public Vehiculo(String marca) {
        this.marca = marca;
    }
    public Vehiculo(String marca, float precio) {
        this.marca = marca;
        this.precio = precio;
    }
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public String toString(){
        return "El modelo :"+modelo+" pertenece a la marca :"+marca+" y tiene un precio de "+precio;
    }


}
