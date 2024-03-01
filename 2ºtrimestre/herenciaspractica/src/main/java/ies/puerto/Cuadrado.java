package ies.puerto;

public class Cuadrado extends Rectangulo{
    
    
    public Cuadrado(){

    }
    public Cuadrado (float lado){
        super(lado,lado);
    }
    @Override
    public String toString(){
        return "Los lados del cuadrado son de "+getBase();
    }
    
    
}
