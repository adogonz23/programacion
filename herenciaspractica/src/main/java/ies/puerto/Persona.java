package ies.puerto;
/**
 * @author 
 * 
    Crea una clase Persona con atributos como nombre, edad y dni. Añade métodos para obtener y establecer los valores de los atributos.
    Crea una clase Alumno que haga uso (extends) de la clase Alumno.
    
 */
public class  Persona extends Autenticacion{
    private String nombre;
    private int edad;
    private String dni;
    private String password;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDni() {
        return dni;
    }
    /**
     * Constructor por defecto
     */
    public Persona(){

    }
    public Persona(String nombre){
        this.nombre=nombre;

    }
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public Persona (String nombre, int edad,String dni){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
    }

    public String toString(){
        return "el alumno se llama "+nombre+"y tiene "+edad+" años";
    }
}
