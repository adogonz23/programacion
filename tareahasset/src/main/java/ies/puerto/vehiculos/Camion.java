package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Camion extends Vehiculo{
    public Camion (){};
    public Camion (String marca,String modelo, String matricula, int velocidad){
        super(marca,modelo,matricula,velocidad);
    }

    @Override
    public int velocidadMaxima() {
        int maxSpeed=180;

        return maxSpeed;
    }

    @Override
    public String toString(){
        return "El Camion: "+getMarca()+", modelo: "+getModelo()+", con matricula: "+getMatricula()+", alcanza una velocidad maxima de :"+getVelocidad();
    }
}
