package ies.puerto.abstractas;

import ies.puerto.interfaces.IVhehiculo;

public abstract class Vehiculo implements IVhehiculo{

    private String marca;
    private String modelo;
    private String matricula;
    private int velocidad;

    
    
    
    
    /**
     * constructor por defecto
     */
    public Vehiculo() {
    }
    /**
     * Constructor con un parametro
     * @param matricula del vehiculo
     */
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }
    /**
     *  constructor con 2 parametros
     * @param marca del vehiculo
     * @param modelo del vheiculo
     */
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    /**
     * Constructor con 3 parametros
     * @param marca del vehiculo
     * @param modelo del vehiculo
     * @param velocidad del vehiculo
     */
    public Vehiculo(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    public Vehiculo(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }
    /**
     * Constructor con todos los atributos de la clase.
     * @param marca
     * @param modelo
     * @param matricula
     * @param velocidad
     */
    public Vehiculo(String marca, String modelo, String matricula, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = velocidad;
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
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }









    @Override
    public int velocidadMaxima() {
        
        throw new UnsupportedOperationException("Unimplemented method 'velocidadMaxima'");
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehiculo other = (Vehiculo) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }
    @Override
    public String toString(){
        return "El vehiculo: "+marca+", modelo: "+modelo+", con matricula: "+matricula+", alcanza una velocidad maxima de :"+velocidad;
    }
}
