package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Motocicleta extends Vehiculo{
    
    public Motocicleta(){};
    public Motocicleta(String marca,String modelo,String matricula,int velocidad){
        super(marca,modelo,matricula,velocidad);
    };

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
