package ies.puerto.modelo.abstractas;

import java.io.File;

public abstract class FileAbs {
    
    public boolean existeFichero(String path){
        File file = new File(path);
        if (path.isEmpty()|| path==null) {
            return false;
        }
        return file.isFile()&& file.exists();
    }
}
