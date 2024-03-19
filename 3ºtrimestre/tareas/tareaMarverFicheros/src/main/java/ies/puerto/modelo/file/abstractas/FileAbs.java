package ies.puerto.modelo.file.abstractas;

import java.io.File;

import ies.puerto.config.FicheroProperties;

public abstract class FileAbs extends FicheroProperties{
    
    public boolean existeFichero(String path){
        File file = new File(path);
        if (path.isEmpty() || path == null) {
            return false;
        }
        return file.isFile() && file.exists();
    }
}
