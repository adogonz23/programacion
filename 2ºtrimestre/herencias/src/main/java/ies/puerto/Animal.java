package ies.puerto;


public abstract class Animal {
    
    private int chip;
    private String nombre;
    


    public Animal (){

    }
    public Animal (String nombre, int chip){
        this.nombre=nombre;
        this.chip=chip;
    }
    public String suSonido(){
        return "Soy un sonido de Animal";
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+", chip: "+chip; 
    }
}

