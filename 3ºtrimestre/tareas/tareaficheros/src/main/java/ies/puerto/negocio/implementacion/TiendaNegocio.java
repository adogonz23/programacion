package ies.puerto.negocio.implementacion;

import ies.puerto.modelo.file.implementacion.csv.FileCsv;

public class TiendaNegocio extends FileCsv{
    FileCsv fileCsv;
    
    public TiendaNegocio(){
        fileCsv =new FileCsv();
    }
}
