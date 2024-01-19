package ies.puerto.impl;

import ies.puerto.interfaz.IConecxionRed;

public class ConecxionEthernet  implements IConecxionRed{

    @Override
    public String conectar() {
        
        return "Estoy es una conexion via cable";
    }
}
