package ies.puerto.modelo.file.implementacion.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.file.abstrac.FileAbstrac;
import ies.puerto.modelo.file.intefaces.CRUDFile;

public class FileCsv extends FileAbstrac implements CRUDFile{

    public FileCsv(){
        RUTA_FICHERO="src/resources/alimentos.csv";
    }
    public List<Alimento> obtenerAlimentos(){
        return leerTodos(RUTA_FICHERO);
    }
    @Override
    public List<Alimento> leerTodos(String path) {
        List<Alimento>alimentos= new ArrayList<>();
        if (existeFichero(path)) {
            try (BufferedReader reader = new BufferedReader(new FileReader(path))){
                String linea;
                while ((linea = reader.readLine()) != null) {
                    String[] datos= linea.split(",");
                    alimentos.add(splitAlimento(datos));
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return alimentos;
    }
    
    public Alimento splitAlimento(String[] datos){
        return  new Alimento(Integer.parseInt(datos[0]), datos[1], datos[2],Integer.parseInt(datos[3]),Float.parseFloat(datos[4]),Float.parseFloat(datos[5]),Float.parseFloat(datos[6]));

    }

    @Override
    public boolean escribir(String path, String contenido) {
        return nuevaEntrdaFichero(path, contenido);
    }

    @Override
    public boolean eliminar(String path, int id) {
        List<Alimento>alimentos= leerTodos(path);
        Alimento alimentoBuscar= new Alimento(id);
        if (alimentos.contains(alimentoBuscar)) {
            alimentos.remove(alimentoBuscar);
            sobreescribirFichero(alimentos, path);

        }
        return true;
    }

    @Override
    public boolean actualizar(String path, Alimento alimento) {
        List<Alimento>alimentos= leerTodos(path);
        if (alimentos.contains(alimento)) {
            alimentos.set(alimentos.indexOf(alimento), alimento);
            sobreescribirFichero(alimentos, path);
            return true;
        }
        return false;
        
    }
    public void sobreescribirFichero(List<Alimento> alimentos,String path){
        try(BufferedWriter writter = new BufferedWriter(new FileWriter(path))) {
            for (Alimento alimento : alimentos) {
                writter.write(alimento.toCsv());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
