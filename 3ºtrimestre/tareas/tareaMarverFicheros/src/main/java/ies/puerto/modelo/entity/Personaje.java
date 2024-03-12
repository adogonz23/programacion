package ies.puerto.modelo.entity;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
@Root
public class Personaje {
    @Element
    private String nombre;
    @Element
    private String alias;
    @Element
    private String genero;
    @ElementList(name = "poderes")
    private List<Poder> poderes;
    
    public final String DELIMITADOR =",";
    public final String COMILLAS = "\"";
    

    
    public Personaje() {
            poderes= new ArrayList<>();
    }
    public Personaje(String nombre) {
        this.nombre = nombre;
    }
    public Personaje(String nombre, String alias, String genero, List<Poder> poderes) {
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
    public List<Poder> getPoderes() {
        return poderes;
    }
    public void setPoderes(List<Poder> poderes) {
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
        return nombre+DELIMITADOR+alias+DELIMITADOR+genero+DELIMITADOR+COMILLAS+poderestoString()+COMILLAS;
    }
    public String poderestoString(){
        String poderesString="";
        for (Poder poder : poderes) {
            int posicion;
            if (( posicion = poderes.indexOf(poder))== poderes.size()-1) {
                poderesString+=poder.toCsv();
            }else{
                poderesString+=poder.toCsv()+DELIMITADOR;
            }
            
        }

        return poderesString;
    }
}
