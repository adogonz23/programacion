package ies.puerto;

public class Cuadrado implements IFormaGeomatrica{

    private float lado;
    

    public Cuadrado(float lado) {
        this.lado = lado;
    }


    public float getLado() {
        return lado;
    }


    public void setLado(float lado) {
        this.lado = lado;
    }


    @Override
    public float calcularArea() {
        float area = lado*lado;
        return area;
    }
    @Override 
    public String toString(){
        return "El area del cuadrado es de "+calcularArea();
    }
}
