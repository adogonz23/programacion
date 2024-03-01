package ies.puerto.impl;

import ies.puerto.interfaz.IConductor;

public class Automovil implements IConductor {

    @Override
    public String arrancar() {
        return "Arrancado el coche,Señores!";
    }

    @Override
    public String detener() {
        return "Apagando motores, Señores!";
    }
    public String conducir(){
        return "Estamos cunduciendo señores";
    }
    

    
    
}
