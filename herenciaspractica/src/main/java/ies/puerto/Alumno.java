package ies.puerto;
/**
 * Crea una clase Estudiante que herede de la clase Persona. La clase Estudiante debe tener atributos adicionales como curso y notas, 
 *  métodos para obtener y establecer estos valores.
 * Añade un método saludar en la clase Persona que imprima un mensaje genérico. Sobrescribe este método en 
 * la clase Estudiante para imprimir un mensaje personalizado.
 * Añade constructores a las clases Persona y Estudiante que permitan inicializar los atributos al crear objetos. 
 * Utiliza el constructor de la clase base (Persona) en el constructor de la clase derivada (Estudiante) utilizando super.
 */


public class Alumno extends Persona {
    private String cial;
    private String curso;
    private int[] notas;

    

    public String getCial() {
        return cial;
    }

    public void setCial(String cial) {
        this.cial = cial;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public Alumno(String nombre, int edad, String cial){
        super(nombre,edad);
        this.cial=cial;
    }
    public Alumno(String nombre, int edad, String cial,String curso){
        super(nombre,edad);
        this.cial=cial;
        this.curso=curso;
    }
    public Alumno(String nombre, int edad, String cial,String curso,int[]notas){
        super(nombre,edad);
        this.cial=cial;
        this.curso=curso;
        this.notas=notas;
    }
    
    @Override
    public String toString(){
        return "el alumno se llama "+getNombre()+", tiene "+getEdad()+" años y cursa :"+curso;
    }
    
}
