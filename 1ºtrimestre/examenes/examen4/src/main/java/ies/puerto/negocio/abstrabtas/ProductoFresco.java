package ies.puerto.negocio.abstrabtas;

import ies.puerto.modelo.interfaces.ISaludable;

public abstract class ProductoFresco extends Producto implements ISaludable{

private String fCaducidad;

    @Override
    public int diasCaducidad() {
        return 0;
    }

    @Override
    public boolean esCaducado() {
        return false;
    }
    
}
