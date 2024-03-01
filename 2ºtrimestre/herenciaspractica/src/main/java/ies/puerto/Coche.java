package ies.puerto;

public class Coche extends Vehiculo {

    private String traccion;

    public String getTraccion() {
        return traccion;
    }

    public Coche (){

    }

    public Coche(String marca, String modelo,float precio, String traccion){
        super(marca, modelo, precio);
        this.traccion=traccion;
    }

}
