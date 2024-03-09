package ies.puerto.modelo.entity;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root (name="personas")
public class ListPersona {

    @ElementList(inline = true)
    private List<Persona> personas;
    
    public ListPersona() {
    }
    public ListPersona(List<Persona> personas) {
        this.personas = personas;
    }
    public List<Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
