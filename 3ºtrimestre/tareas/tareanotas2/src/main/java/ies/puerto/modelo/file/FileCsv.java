package ies.puerto.modelo.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import ies.puerto.modelo.abstractas.FileAbs;
import ies.puerto.modelo.entity.Persona;

public class FileCsv extends FileAbs {
    
    List<Persona>personas;
    
    String rutaFichero="";

    public FileCsv(){
        personas= new ArrayList<>();
    }
    public List<Persona> obtenerDatos(String path){
        File file = new File(path);
        if (existeFichero(path)) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String linea;
                while ((linea=reader.readLine())!=null) {
                    String[]datos= linea.split(",");
                    personas.add(splitPersona(datos));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return personas;
    }
    public Persona splitPersona(String[]datos){
        Persona persona= new Persona(datos[0],Integer.parseInt(datos[1]),datos[2]);
        return persona;
    }
    public boolean escribirFichero(String path, List<Persona>personas){
        if (!existeFichero(path)) {
            return false;
        }
        File file = new File(path);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            for (Persona persona : personas) {
                writer.write(persona.toCsvDatos()+"\n");
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean añadirPersona(String path, Persona persona){
        if (existeFichero(path) && !personas.contains(persona)) {
            backup(personas);
            personas.add(persona);
            escribirFichero(path,personas);
            return true;
        }
        crearFichero(path);
        return personas.add(persona);

    }
    public int contarLineas(String path){
        personas= obtenerDatos(path);
        return personas.size();
    }
    public void alumnosAprobados(String path){
        List<Persona> aprobados= new ArrayList<>();
        for (Persona persona : personas) {
            if (persona.getNota()>=5) {
                aprobados.add(persona); 
            }
        }
        escribirFichero(path,aprobados);
    }
    public boolean crearFichero(String path){
        File ficheroNuevo= new File(path);
        try {
            return ficheroNuevo.createNewFile();
        } catch (Exception e) {
            return false;
        }
        
    }
    public String fechaBackup(){
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime fechaActual= LocalDateTime.now();
        try {
            String fechaString = fechaActual.format(formato);
            return"src/resources/"+fechaString+".csv";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean backup(List<Persona>personas){
        String fecha= fechaBackup();
        crearFichero(fecha);
        return escribirFichero(fecha, personas);
    }
}
