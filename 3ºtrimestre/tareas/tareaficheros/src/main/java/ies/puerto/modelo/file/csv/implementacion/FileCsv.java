package ies.puerto.modelo.file.csv.implementacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import ies.puerto.modelo.entity.Persona;
import ies.puerto.modelo.file.abstractas.FlieAbstrac;
import ies.puerto.modelo.interfaces.CRUDoperaciones;

public class FileCsv  extends FlieAbstrac implements CRUDoperaciones{
    String RUTA_FICHERO = "src/resources/data.csv";
    public String getRUTA_FICHERO() {
        return RUTA_FICHERO;
    }
    @Override
    public List<Persona> obtenerDatos(String path){
        List<Persona>personas = new ArrayList<>();
        if (existeFichero(path)) {
            try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String linea;
                while ((linea=reader.readLine()) != null) {
                    String[]datos = linea.split(",");
                    personas.add(splitPersona(datos));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return personas;
    }
    
    public Persona splitPersona(String[]datos){
        Persona persona = new Persona(Integer.parseInt(datos[0]),datos[1], Integer.parseInt(datos[2]), datos[3]);
        return persona;
    }
    @Override
    public boolean actualizarPersona(Persona persona){
        List<Persona> personas= obtenerDatos(RUTA_FICHERO);
        if (personas.contains(persona)) {
            int posicion = personas.indexOf(persona);
            personas.set(posicion, persona);
            escribirFichero(personas, RUTA_FICHERO);
            return true;
        }
        return false;
    }
    public void escribirFichero(List<Persona>personas, String path){
        if (existeFichero(path)&& !personas.isEmpty()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
                for (Persona persona : personas) {
                    writer.write(persona.toCsv()+"\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public boolean añadirPersona(Persona persona, String path){
        List<Persona>personas = obtenerDatos(path);
        if (personas.contains(persona)) {
            return true;
        }
        personas.add(persona);
        escribirFichero(personas, path);
        return true;
    }
    @Override
    public Persona obtenerPersona(int id,String path){
        Persona personaBuscar= new Persona(id);
        List<Persona>personas= obtenerDatos(path);
        int posicion =  personas.indexOf(personaBuscar);
        if (personas.contains(personaBuscar) ) {
            return personas.get(posicion);
        }
        return null;
    }
    
    @Override
    public boolean eliminarPersonas(Persona persona ,String path){
        List<Persona>personas=obtenerDatos(path);
        if (!personas.contains(persona)) {
            return true;
        }
        personas.remove(persona);
        escribirFichero(personas, path);
        return true;
    }
}
