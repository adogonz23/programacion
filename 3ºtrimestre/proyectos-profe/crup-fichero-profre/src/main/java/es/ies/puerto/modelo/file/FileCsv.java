package es.ies.puerto.modelo.file;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.utilidades.Utilidades;

public class FileCsv  extends Utilidades{
    
    String path ="src/main/resources/data.csv";


    public List<Persona> readAll() {
        List<Persona> personas = new ArrayList<>();
        int contador= 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (contador>0) {
                String[] datos = linea.split(DELIMITADOR);
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                int edad = Integer.parseInt(datos[2]);
                String email = datos[3];
                Persona persona = new Persona(id, nombre, edad, email);
                personas.add(persona);
                }
                contador++;
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personas;
    }
    public Persona getPerson(Persona persona) {
        int contador= 0;
        boolean find = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null && (!find)) {
                if (contador>0) {
                String[] datos = linea.split(DELIMITADOR);
                int id = Integer.parseInt(datos[0]);
                    if (id == persona.getId()) {
                        String nombre = datos[1];
                        int edad = Integer.parseInt(datos[2]);
                        String email = datos[3];
                        persona.setEdad(edad);
                        persona.setNombre(nombre);
                        persona.setEmail(email);
                        find = true;
                    }
                }
                contador++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persona;
    }
    public void addPerson(Persona persona){
        Persona personaBuscar = new Persona(persona.getId());
        personaBuscar = getPerson(personaBuscar);
        if (personaBuscar.getEmail()==null) {
            try(FileWriter writer = new FileWriter(path,true)) {
                writer.write(persona.toCSV()+"\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    public void updatePerson(Persona persona){
        List<Persona> personas = readAll();
        try (FileWriter writer = new FileWriter(path)) {
            for (Persona person : personas) {
                if (person.getId() == persona.getId()) {
                    writer.write(persona.getId() + "," + persona.getNombre() + "," + persona.getEdad() + "," + persona.getEmail() + "\n");
                } else {
                    writer.write(person.getId() + "," + person.getNombre() + "," + person.getEdad() + "," + person.getEmail() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void deletePerson(int id){
        List<Persona> personas = readAll();
        try (FileWriter writer = new FileWriter(path)) {
            for (Persona persona : personas) {
                if (persona.getId() != id) {
                    writer.write(persona.getId() + "," + persona.getNombre() + "," + persona.getEdad() + "," + persona.getEmail() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
