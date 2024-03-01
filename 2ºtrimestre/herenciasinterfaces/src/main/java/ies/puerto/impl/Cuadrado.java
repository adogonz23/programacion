package ies.puerto.impl;

import ies.puerto.abstracto.RegularesAbs;
import ies.puerto.interfaz.IFormaGeomatrica;

public class Cuadrado extends RegularesAbs implements IFormaGeomatrica{

    public Cuadrado(float base) {
        super(base);
    }
    public Cuadrado(float base , float altura){
        super(base,altura);
    }

    @Override
    public float calcularArea() {
        float area = getBase()*getAltura();
        return area;
    }
    @Override 
    public String toString(){
        return "El area del cuadrado es de "+calcularArea();
    }
}
