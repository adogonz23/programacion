package ies.puerto.modelo.file.implementacion.fileCsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


import ies.puerto.modelo.entity.Personaje;
import ies.puerto.modelo.entity.interfaces.CrudFile;
import ies.puerto.modelo.file.abstractas.FileAbs;

public class FileCsv extends FileAbs  implements CrudFile{
    
    List<Personaje>personajes;

    String RUTA_CSV= obtenerPropiedades().getProperty("ruta-csv");

    public List<Personaje> obtenerDatos(){
        personajes= new ArrayList<>();
        if (existeFichero(RUTA_CSV)) {
            File file = new File(RUTA_CSV);
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String linea;
                while ((linea= reader.readLine())!=null) {
                    String[] datos = linea.split(",");
                    Personaje personaje= splitPersonaje(datos);
                    personajes.add(personaje);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return personajes;
    }
    public Personaje splitPersonaje(String[]datos){
        String regex = "^\"|\"$";
        List<String>poderes= new ArrayList<>();
        Personaje personaje= new Personaje(datos[0],datos[1], datos[2], poderes);
        for(int i=3; i< datos.length;i++){
            String poder = datos[i].replaceAll(regex,"");
            poderes.add(poder);
        }
        return personaje;
    }
    public boolean escribirFichero( List<Personaje>personajes){
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(new File(RUTA_CSV)))){
            for (Personaje personaje : personajes) {
                writer.write(personaje.toCsv()+"\n");
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean addPersonaje(Personaje personaje){
        if (personajes.contains(personaje)) {
            return true;
        }
        personajes.add(personaje);
        return escribirFichero(personajes);
    }
    public boolean eliminarPersonaje(Personaje personaje){
        if (!personajes.contains(personaje)) {
            return true;
        }
        personajes.remove(personaje);
        return escribirFichero(personajes);
    }
    public boolean actualizarPersonaje(Personaje personaje){
        if (personajes.contains(personaje)) {
            int posicion = personajes.indexOf(personaje);
            personajes.set(posicion, personaje);
            return escribirFichero(personajes);
        }
        return false;
    }
    public Personaje obtenerPersonaje(String nombre){
        Personaje personaje = new Personaje(nombre);
        if (personajes.contains(personaje)) {
            int posicion = personajes.indexOf(personaje);
            personaje = personajes.get(posicion);
            return personaje;
        }
        return null;
    } 
}
