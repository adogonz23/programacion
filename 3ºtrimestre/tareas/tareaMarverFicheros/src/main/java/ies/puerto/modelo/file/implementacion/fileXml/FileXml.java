package ies.puerto.modelo.file.implementacion.fileXml;

import java.io.File;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPersonaje'");
    }

    @Override
    public boolean eliminarPersonaje(Personaje personaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarPersonaje'");
    }

    @Override
    public boolean actualizarPersonaje(Personaje personaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarPersonaje'");
    }

    @Override
    public Personaje obtenerPersonaje(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerPersonaje'");
    }
    
}
