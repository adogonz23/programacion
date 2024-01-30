package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Coche extends Vehiculo{



    @Override
    public int velocidadMaxima() {
        int maxSpeed=180;

        return maxSpeed;
    }

    @Override
    public String toString(){
        return "El coche: "+getMarca()+", modelo: "+getModelo()+", con matricula: "+getMatricula()+", alcanza una velocidad maxima de :"+getVelocidad();
    }
    

    
}
