package ies.puerto;
/**
 * @author adogonz23
 */
public class Circulo {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    /**
     * Constructor base
     */
    /**Constructor
     * @param radio valor del radio
     */
    public Circulo(double radio){
        this.radio= radio;
    }
    /**
     *  matodo que nos calcula el area de un circulo
     * @param radio valor del radio del circulo
     * @return area de un circulo
     */
    public double area(){
        return 3.14 * (radio*radio);
    }
    /**
     * metodo que nos calcula la circunferencia
     * @param radio valor del radio
     * @return valor circunferencia
     */
    public double circunferencia(){
        return  2*3.14 *radio;
    }
    public String impriomirInfo(){
        return "Un circulo con radio"+radio+" tiene un area de ="+area()+" y una circunferencia de ="+circunferencia();
    }
    public void cambiarRadio(double nuevoRadio){
        this.radio= nuevoRadio;
    }
}
