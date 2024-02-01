package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Bicicleta extends Vehiculo{
     public Bicicleta (){};
    public Bicicleta (String marca,String modelo, String matricula, int velocidad){
        super(marca,modelo,matricula,velocidad);
    }

    @Override
    public int velocidadMaxima() {
        int maxSpeed=40;

        return maxSpeed;
    }

    @Override
    public String toString(){
        return "El Bicicleta: "+getMarca()+", modelo: "+getModelo()+", con matricula: "+getMatricula()+", alcanza una velocidad maxima de :"+getVelocidad();
    }
 
}
