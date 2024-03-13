package ies.puerto.modelo.entity;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name ="poderes")
public class PoderList {
    @ElementList(inline = true ,entry = "poder")
    List<String>poderes;
    
    public List<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }

}
