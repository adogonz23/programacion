package ies.puerto.modelo.file.abstractas;

import java.io.File;

import java.util.List;

import ies.puerto.config.FicheroProperties;
import ies.puerto.modelo.entity.Personaje;

public abstract class FileAbs extends FicheroProperties{
    
    List<Personaje>personajes;

    public boolean existeFichero(String path){
        File file = new File(path);
        if (path.isEmpty() || path == null) {
            return false;
        }
        return file.isFile() && file.exists();
    }
    public boolean addPersonaje(Personaje personaje){
        if (personajes.contains(personaje)) {
            return true;
        }
        return personajes.add(personaje);
    }
    public boolean eliminarPersonaje(Personaje personaje){
        if (!personajes.contains(personaje)) {
            return true;
        }
        return personajes.remove(personaje);
    }
    public Personaje obtenerPersonaje(String id){
        Personaje personaje = new Personaje(id);
        if (!personajes.contains(personaje)) {
            return null;
        }
        int posicion = personajes.indexOf(personaje);
        return personajes.get(posicion);
        
    }
    public boolean actualizarPersonaje(Personaje personaje){
        if (!personajes.contains(personaje)) {
            return false;
        }
        int posicion= personajes.indexOf(personaje);
        personajes.set(posicion, personaje);
        return true;
    }
}
