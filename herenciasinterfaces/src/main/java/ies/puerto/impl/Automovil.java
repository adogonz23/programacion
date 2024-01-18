package ies.puerto.impl;

import ies.puerto.interfaz.IConductor;

public class Automovil implements IConductor {

    private Boolean estado;

    

    public Automovil(Boolean estado) {
        this.estado = estado;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public void arrancar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void detener() {
        // TODO Auto-generated method stub
        
    }
    
    
}
