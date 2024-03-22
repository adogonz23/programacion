package ies.puerto.modelo.entity;

import java.util.List;



import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;


import ies.puerto.modelo.utilidades.Utilidades;



@Root (name = "personaje")
public class Personaje extends Utilidades{
    @Element (name="nombre")
    private String nombre;
    
    @Element(name = "alias")
    private String alias;
    
    @Element(name ="genero")
    private String genero;

    @ElementList (name = "poderes", entry = "poder")
    private List<String> poderes;


    
    public Personaje(){
        
    }
    
    public Personaje(String nombre) {
        this.nombre = nombre;
    }
    public Personaje(String nombre, String alias, String genero, List<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
        
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public List<String> getPoderes() {
        return poderes;
    }
    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }
    @Override
    public String toString() {
        return "Personaje nombre=" + nombre + ", alias=" + alias + ", genero=" + genero + ", poderes=" + poderes + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
        Personaje other = (Personaje) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
    public String toCsv(){
        return nombre+DELIMITADOR+alias+DELIMITADOR+genero+DELIMITADOR+poderesToCsv();
    }
    public String poderesToCsv(){
        String podresCsv="";
        for (String poder : poderes) {
            if (poderes.indexOf(poder)== (poderes.size()-1)) {
                podresCsv+= poder;
            }
            else{
                podresCsv+= poder+",";
            }
        }
        return podresCsv;
    }
    
}
