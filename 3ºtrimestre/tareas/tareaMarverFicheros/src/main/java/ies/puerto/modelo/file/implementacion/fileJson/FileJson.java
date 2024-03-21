package ies.puerto.modelo.file.implementacion.fileJson;


import java.io.FileWriter;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import ies.puerto.modelo.entity.Personaje;
import ies.puerto.modelo.entity.interfaces.CrudFile;
import ies.puerto.modelo.file.abstractas.FileAbs;

public class FileJson extends FileAbs implements CrudFile {

    List<Personaje>personajes;
    String RUTA_FICHERO=obtenerPropiedades().getProperty("ruta-json");
    
    @Override
    public List<Personaje> obtenerDatos() {
        try {
            String json= new String(Files.readAllBytes(Paths.get(RUTA_FICHERO)));
            Type listType = new TypeToken<List<Personaje>>(){}.getType();
            personajes = new Gson().fromJson(json, listType);
            return personajes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personajes;
    }

    @Override
    public boolean escribirFichero(List<Personaje> personajes) {
        if (existeFichero(RUTA_FICHERO)) {
        try (FileWriter writer = new FileWriter(RUTA_FICHERO)){
            new GsonBuilder().setPrettyPrinting().create().toJson(personajes,writer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        return false;
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
