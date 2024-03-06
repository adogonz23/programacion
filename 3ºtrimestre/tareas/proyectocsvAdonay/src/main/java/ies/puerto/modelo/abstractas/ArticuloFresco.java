package ies.puerto.modelo.abstractas;

import ies.puerto.modelo.intefaces.ISaludable;

public abstract class ArticuloFresco extends Articulo implements ISaludable{

    public ArticuloFresco(String id, String nombre, float precio, String fCaducidad, String fEntrada) {
        super(id, nombre, precio, fCaducidad, fEntrada);
    }
    public ArticuloFresco(String id){
        super(id);
    }
    
}
