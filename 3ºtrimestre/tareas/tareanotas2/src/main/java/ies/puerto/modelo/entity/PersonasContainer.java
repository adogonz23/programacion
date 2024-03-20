package ies.puerto.modelo.entity;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root (name ="personas")
public class PersonasContainer {
    @ElementList(inline = true, entry = "personas")
    private List<Persona>personas;
    
    public PersonasContainer() {
    }

    public PersonasContainer(List<Persona> personas) {
        this.personas = personas;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}

