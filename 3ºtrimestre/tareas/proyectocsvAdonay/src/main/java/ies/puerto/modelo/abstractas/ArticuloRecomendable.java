package ies.puerto.modelo.abstractas;

import ies.puerto.modelo.intefaces.IRecomendable;

public abstract class ArticuloRecomendable extends Articulo implements IRecomendable {

    public ArticuloRecomendable(String id, String nombre, float precio, String fEntrada) {
        super(id, nombre, precio, fEntrada);
    }
    
}
