package ies.puerto.impl;

public class Rectangulo  extends Cuadrado{

    public Rectangulo(float base, float altura) {
        super(base,altura);
        
    }
    @Override
    public String toString(){
        return "El area del rectangualo es "+calcularArea();
    }
}
