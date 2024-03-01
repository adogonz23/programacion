package ies.puerto;
/**
 * @author adogonz23
 */
public class Persona {
    private String nombre;
    private int edad;
    private String email;
    private String telefono;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

/**
 * constructor por defecto de la clase
 */
    public Persona(){
    }
    /**
     * 
     * @param nombre
     */
    public Persona(String nombre){
        this.nombre=nombre;
    }
    /**
     * 
     * @param nombre
     * @param edad
     */
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    /**
     * 
     * @param nombre
     * @param edad
     * @param email
     */
    public Persona(String nombre, int edad, String email){
        this.nombre=nombre;
        this.edad=edad;
        this.email=email;
    }
    /**
     * 
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona 
     * @param telefono de la
     */
    public Persona(String nombre, int edad, String email, String telefono){
        this.nombre=nombre;
        this.edad=edad;
        this.email=email;
        this.telefono=telefono;
    }
    public void imprimir(){
        System.out.println("nombre:"+nombre);
        System.out.println("edad:"+edad);
        System.out.println("email:"+email);
        System.out.println("telefono:"+telefono);
    }
    public String imprimir2(){
        return "Nombre: "+nombre+" edad: "+edad+" email: "+ email+ " telefono: "+telefono;
    }
}
