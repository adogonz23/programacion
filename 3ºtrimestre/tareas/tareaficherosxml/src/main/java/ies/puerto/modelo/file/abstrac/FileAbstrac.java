package ies.puerto.modelo.file.abstrac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public abstract class FileAbstrac {
    
    public  String RUTA_FICHERO ="";

    public boolean existeFichero(String path){
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }
    public boolean nuevaEntrdaFichero(String path, String texto){
        if (!existeFichero(path)) {
            return false;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path,true))){
            writer.write(texto);
            writer.newLine();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


}
