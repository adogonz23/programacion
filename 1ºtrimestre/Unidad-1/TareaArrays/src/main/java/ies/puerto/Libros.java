package ies.puerto;
/**
 * @author adogonz23
 */
public class Libros {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPublicacion() {
        return anoPublicacion;
    }
    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
    /**
     * 
     * constructor por defecto
     */
    public Libros() {
    }
    /**
     * 
     * @param titulo del libro
     */
    public Libros(String titulo){
        this.titulo= titulo;
    }
    public Libros(String titulo, String autor ){
        this.titulo= titulo;
        this.autor= autor;
    }
    public Libros(String titulo, String autor , int anoPublicacion){
        this.titulo=titulo;
        this.autor= autor;
        this.anoPublicacion= anoPublicacion;   
    }
    /**
     * @return informnacion del libro;
     */
    public String imprimir(){
        return "Titulo: "+ titulo+" Autor: "+autor+ " Año de publicación :"+ anoPublicacion;
        
    }
    /** metodo que nor permite cambiar el noimbre del autor
     * @param nuevoAutor String del nuevo autor; 
     */
    public void cambiarAutor(String nuevoAutor){
        this.autor=nuevoAutor;
    }

}
