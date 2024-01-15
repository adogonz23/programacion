package ies.puerto;

public abstract class Figura {
    private float base;
    private float altura;
    private float profundida;

    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getProfundida() {
        return profundida;
    }
    public void setProfundida(float profundida) {
        this.profundida = profundida;
    }
    public Figura(){

    }
    public Figura(float base, float altura){
        this.base=base;
        this.altura=altura;
    }
    
    public Figura(float base, float altura, float profundida) {
        this.base = base;
        this.altura = altura;
        this.profundida = profundida;
    }
    @Override
    public String toString(){
        return "base= "+base+" altura= "+altura+" profundida= "+profundida;
    }

    public abstract float calcularArea();
}
