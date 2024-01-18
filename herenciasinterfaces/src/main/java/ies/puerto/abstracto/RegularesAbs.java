package ies.puerto.abstracto;

public abstract class RegularesAbs {
    private float base;
    private float altura;
    
    public RegularesAbs(float base) {
        this.base = base;
    }
    public RegularesAbs(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
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

}
