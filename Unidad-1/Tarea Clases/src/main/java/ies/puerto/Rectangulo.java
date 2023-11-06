package ies.puerto;
/**
 * @author adogonz23
 */
public class Rectangulo {
    private float largo;
    private float ancho;
    
    
    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    public float getLargo() {
        return largo;
    }
    public void setLargo(float largo) {
        this.largo = largo;
    }
    public float getAncho() {
        return ancho;
    }
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    public String printInfo(){
        return " el area de un triangulo con catetos :"+largo+ " "+ancho+" es de = "+hallarArea();
    }
    public float hallarArea(){
        float area= getAncho()*getLargo()/2;
        return area;
        
    }
    public float hallarPerimetro(){
        float perimetro  = lado1+ lado2+ lado3;
        return perimetro;
    }
    
}
