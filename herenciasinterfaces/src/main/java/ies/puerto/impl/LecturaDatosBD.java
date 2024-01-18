package ies.puerto.impl;

import ies.puerto.abstracto.LecturaDatosAbs;


public class LecturaDatosBD  extends LecturaDatosAbs{

    @Override
    public String apertura() {
        
        return "Apertura de la base de datos";
    }

    @Override
    public String cierre() {
        
        return "Cierre de la base de datos";
    }

    @Override
    public String lectura() {
        
        return "Leyendo los datos desde base de datos";
    }
    
}
