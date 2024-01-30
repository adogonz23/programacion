package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Motocicleta extends Vehiculo{
    
    @Override
    public int velocidadMaxima() {
        int maxSpeed=120;

        return maxSpeed;
    }
    @Override
    public String toString(){
        return "La moto: "+getMarca()+", modelo: "+getModelo()+", con matricula: "+getMatricula()+", alcanza una velocidad maxima de :"+getVelocidad();
    }
}
