package ies.puerto.modelo.entity;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name ="poderes")
public class PoderList {
    @ElementList(inline = true)
    List<Poder>poderes;

    public List<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }

    @Override
    public String toString() {
        return "PoderList [poderes=" + poderes + "]";
    }

    
}
