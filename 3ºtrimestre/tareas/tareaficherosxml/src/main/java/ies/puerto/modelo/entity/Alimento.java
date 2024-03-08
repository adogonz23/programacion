package ies.puerto.modelo.entity;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="alimento")
public class Alimento{
    @Element(name="id")
    int id;
    @Element(name = "nombre")
    String nombre;
    @Element(name = "tipo")
    String tipo;
    @Element(name="calorias")
    int calorias;
    @Element (name ="proteinas")
    float proteinas;
    @Element(name="grasas")
    float grasas;
    @Element(name="carbohidratos")
    float carbohidratos;
    final String DELIMITADOR=",";
    
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCalorias() {
        return calorias;
    }
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    public float getProteinas() {
        return proteinas;
    }
    public void setProteinas(float proteinas) {
        this.proteinas = proteinas;
    }
    public float getGrasas() {
        return grasas;
    }
    public void setGrasas(float grasas) {
        this.grasas = grasas;
    }
    public float getCarbohidratos() {
        return carbohidratos;
    }
    public void setCarbohidratos(float carbohidratos) {
        this.carbohidratos = carbohidratos;
    }
    /**
     * Constructor por defecto
     */
    public Alimento(){

    }
    public Alimento(int id) {
        this.id = id;
    }
    public Alimento(int id, String nombre, String tipo, int calorias, float proteinas, float grasas,
            float carbohidratos) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.grasas = grasas;
        this.carbohidratos = carbohidratos;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alimento other = (Alimento) obj;
        if (id != other.id)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Alimento [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", calorias=" + calorias
                + ", proteinas=" + proteinas + ", grasas=" + grasas + ", carbohidratos=" + carbohidratos + "]";
    }
    public String toCsv(){
        return id+DELIMITADOR+nombre+DELIMITADOR+tipo+DELIMITADOR+calorias+DELIMITADOR+proteinas
        +DELIMITADOR+grasas+DELIMITADOR+carbohidratos+"\n";
    }
}
