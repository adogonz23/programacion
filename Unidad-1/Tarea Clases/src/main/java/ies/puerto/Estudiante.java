package ies.puerto;

/**
 *@author adogonz23
 */
public class Estudiante{
    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;
    private int[] notas;
    
    
    /**
     * Constructor de la clase Estudiante
     * @param nombre del alumno
     * @param edad del alumno
     * @param carrera que cursa el alumno
     * @param notas notas del alumno
    
     */
    public Estudiante(String nombre, int edad, String carrera,int[]notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.notas=notas;
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
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public int[] getNotas() {
        return notas;
    }
    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    
    public String printInfo(){
        return "El alumno "+nombre+" con edad "+edad+ "años, cursando la carrera de "+carrera+ ", con una media de "+promedio+" esta "+resultadoCurso();
    }
    /**
     * 
     * @return metodo que nos dice si aprueba o repite
     */
    public String resultadoCurso(){
        if (promedio >= 5.0) {
            return "aprovado";
        }else{
            return "suspendido";
        }
        
    }
    /**
     * metodo que nos setea el resultado medio de las notas
     * @param notas array con las notas del alumno
     */
    public void promedioNotas(int[] notas){
        int suma=0;
        double media=0;
        
        for (int i=0; i< notas.length;i++){
                suma= suma+notas[i];
                media= suma /(notas.length);
    }   
    this.promedio= media;
    }

}

