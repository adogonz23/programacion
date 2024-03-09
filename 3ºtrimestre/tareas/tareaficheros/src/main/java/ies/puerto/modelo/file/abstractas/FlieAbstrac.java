package ies.puerto.modelo.file.abstractas;

import java.io.File;

public abstract class FlieAbstrac {
    public boolean existeFichero(String path){
        File fichero = new File(path);
        if (path==null || path.isEmpty()){
            return false;
        }
        return fichero.isFile() && fichero.exists();
    }
}
