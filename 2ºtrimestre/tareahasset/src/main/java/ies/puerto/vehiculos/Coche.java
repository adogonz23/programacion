package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Coche extends Vehiculo{

    public Coche (){};
    public Coche (String marca,String modelo, String matricula, int velocidad){
        super(marca,modelo,matricula,velocidad);
    }

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
