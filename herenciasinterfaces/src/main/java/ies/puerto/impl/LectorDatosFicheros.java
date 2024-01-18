package ies.puerto.impl;

import ies.puerto.interfaz.ILecturaDatos;

public class LectorDatosFicheros implements ILecturaDatos{

    @Override
    public String apertura() {
        return "abriendo el sistema de ficheros";
    }

    @Override
    public String cierre() {
        
        return "Cerrando el sistema de ficheros";
    }

    @Override
    public String lectura() {
        
        return "Realizada la lectuta d datos desde ficheros";
    }
    
}
