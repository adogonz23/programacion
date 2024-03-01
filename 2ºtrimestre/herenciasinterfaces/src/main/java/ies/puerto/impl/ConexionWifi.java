package ies.puerto.impl;

import ies.puerto.interfaz.IConecxionRed;

public class ConexionWifi implements IConecxionRed{

    @Override
    public String conectar() {
        return "esto es una conexion Wireless";
    }
    
}
