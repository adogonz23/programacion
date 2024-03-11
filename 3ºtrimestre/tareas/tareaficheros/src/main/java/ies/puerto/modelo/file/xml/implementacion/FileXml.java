package ies.puerto.modelo.file.xml.implementacion;

import java.io.File;
import java.util.List;

import org.simpleframework.xml.core.Persister;

import ies.puerto.modelo.entity.ListPersona;
import ies.puerto.modelo.entity.Persona;
import ies.puerto.modelo.file.abstractas.FlieAbstrac;
import ies.puerto.modelo.interfaces.CRUDoperaciones;

public class FileXml  extends FlieAbstrac implements CRUDoperaciones {
    public String RUTA_FICHERO= "src/resources/data.xml";
    List<Persona> personas;
    public String getRUTA_FICHERO() {
        return RUTA_FICHERO;
    }

    @Override
    public List<Persona> obtenerDatos(String path) {
        Persister serializer = new Persister();
        File file =new File(path);
        if (existeFichero(path)) {
            try {
                ListPersona personalist = serializer.read(ListPersona.class, file);
                personas = personalist.getPersonas();
                return personas;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return personas;
    }

    @Override
    public boolean actualizarPersona(Persona persona) {
        if (personas.contains(persona)) {
            int posicion = personas.indexOf(persona);
            personas.set(posicion, persona);
                escribirFichero(personas, RUTA_FICHERO);
                return true;
        }
        return false;
    }

    @Override
    public boolean añadirPersona(Persona persona, String path) {
        if (personas.contains(persona)) {
            return true;
        }
        personas.add(persona);
        return escribirFichero(personas, path);
    }

    @Override
    public Persona obtenerPersona(int id, String path) {
        Persona persona=new Persona(id);
        personas = obtenerDatos(path);
        int posicion =  personas.indexOf(persona);
        if (personas.contains(persona) ) {
            return personas.get(posicion);
        }
        return null;
    }

    @Override
    public boolean eliminarPersonas(Persona persona, String path) {
        if (!personas.contains(persona)) {
        return true;
        }
        personas.remove(persona);
        return escribirFichero(personas, path);
    }
    public boolean escribirFichero(List<Persona> personas, String path){
        ListPersona listPersona = new ListPersona(personas);
        Persister serializer = new Persister();
        File file = new File(path);
        try {
            serializer.write(listPersona, file);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
