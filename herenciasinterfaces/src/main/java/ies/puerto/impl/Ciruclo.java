package ies.puerto.impl;

import ies.puerto.interfaz.IFormaGeomatrica;

public class Ciruclo implements IFormaGeomatrica{
    private float radio;

    public Ciruclo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        float area= 3.14F * (radio*radio);
        return area;
    }
    @Override 
    public String toString(){
        return "El area del circulo es de "+calcularArea();
    }
}
