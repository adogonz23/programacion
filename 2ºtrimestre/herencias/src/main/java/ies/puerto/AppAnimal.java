package ies.puerto;

public class AppAnimal {

    //static Animal animal;
    static Gato gato;
    static Perro perro;
    static Loro loro;
    static Serpiente serpiente;

    public static void main(String[] args) {
        //animal = new Animal();
        //System.out.println("Sonido Animal es "+animal.suSonido());
        gato =new Gato("pepe", 1);
        System.out.println("Sonido del gato "+gato.suSonido());
        perro = new Perro("paco", 2);
        System.out.println("Mi perro hace "+perro.suSonido());
        System.out.println(gato.toString());
        loro= new Loro();
        System.out.println(loro.suSonido());
        serpiente = new Serpiente();
        System.out.println(serpiente.suSonido());
    }
    
}
