package ies.puerto.modelo.file.json.implementacion;

import java.io.FileWriter;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import ies.puerto.modelo.entity.Persona;
import ies.puerto.modelo.file.abstractas.FlieAbstrac;
import ies.puerto.modelo.interfaces.CRUDoperaciones;

public class FileJson extends FlieAbstrac implements CRUDoperaciones {
    List<Persona> personas;
    String RUTA_FICHERO= "src/resources/data.json";
    
    public String getRUTA_FICHERO() {
        return RUTA_FICHERO;
    }



    @Override
    public List<Persona> obtenerDatos(String path) {
        
            try {
                String json= new String(Files.readAllBytes(Paths.get(path)));
                Type listType = new TypeToken<List<Persona>>(){}.getType();
                personas = new Gson().fromJson(json, listType);
                return personas;
            } catch (Exception e) {
                e.printStackTrace();
        }
        return personas;
    }

    

    @Override
    public boolean actualizarPersona(Persona persona) {
        if (personas.contains(persona)) {
            int posicion = personas.indexOf(persona);
            personas.set(posicion, persona);
                escribirFichero(RUTA_FICHERO);
        }
        return false;
    }

    @Override
    public boolean añadirPersona(Persona persona, String path) {
        if (personas.contains(persona)) {
            return true;
        }
        personas.add(persona);
            escribirFichero(path);
            return true;

    }

    @Override
    public Persona obtenerPersona(int id, String path) {
        Persona persona = new Persona(id);
        if (personas.contains(persona)) {
            int posicion = personas.indexOf(persona);
            persona = personas.get(posicion);
            return persona;
        }
        return null;
    }

    @Override
    public boolean eliminarPersonas(Persona persona, String path) {
        if (personas.contains(persona)) {
            personas.remove(persona);
                escribirFichero(path);
                return true;
        }
        return false;
    }
    public void escribirFichero(String path){
        if (existeFichero(path)) {
            try (FileWriter writer = new FileWriter(path)){
            new GsonBuilder().setPrettyPrinting().create().toJson(personas,writer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
    
}
