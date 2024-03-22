package ies.puerto.modelo.file.implementacion.fileXml;

import java.io.File;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.core.Persister;



import ies.puerto.modelo.entity.Personaje;
import ies.puerto.modelo.entity.PersonajeList;
import ies.puerto.modelo.entity.interfaces.CrudFile;
import ies.puerto.modelo.file.abstractas.FileAbs;

public class FileXml extends FileAbs implements CrudFile {
    private List<Personaje>personajes;
    String RUTA_FICHERO= obtenerPropiedades().getProperty("ruta-xml");

    public FileXml(){
        personajes= new ArrayList<>();
    }

    @Override
    public List<Personaje> obtenerDatos() {
            Persister serializer = new Persister();
            File file = new File(RUTA_FICHERO);
            try {
                PersonajeList personajeList = serializer.read(PersonajeList.class,file);
                personajes= personajeList.getPersonajes();
                return personajes;
            } catch (Exception e) {
                e.printStackTrace();
                return personajes;
            }
        
    }
    
    @Override
    public boolean escribirFichero(List<Personaje> personajes) {
        Persister serializer = new Persister();
        PersonajeList personajeList = new PersonajeList(personajes);
        File file = new File(RUTA_FICHERO);
        try {
            serializer.write(personajeList, file);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    @Override
    public boolean addPersonaje(Personaje personaje) {
        if (personajes.contains(personaje)) {
            return true;
        }
        personajes.add(personaje);
        return escribirFichero(personajes);
    }

    @Override
    public boolean eliminarPersonaje(Personaje personaje) {
        if (!personajes.contains(personaje)) {
            return true;
        }
        personajes.remove(personaje);
        return escribirFichero(personajes);
    }

    @Override
    public boolean actualizarPersonaje(Personaje personaje) {
        if (personajes.contains(personaje)) {
            int posicion = personajes.indexOf(personaje);
            personajes.set(posicion, personaje);
            return escribirFichero(personajes);
        }
        return false;
    }

    @Override
    public Personaje obtenerPersonaje(String nombre) {
        Personaje personaje = new Personaje(nombre);
        if (personajes.contains(personaje)) {
            int posicion = personajes.indexOf(personaje);
            personaje = personajes.get(posicion);
            return personaje;
        }
        return null;
    }
    
}
