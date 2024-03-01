package ies.puerto.negocio.abstrabtas;

import ies.puerto.modelo.interfaces.IVendible;

public abstract class  Producto implements IVendible {

    private String nombre;
    private float precio;
    private String fEntrada;
    private String udi;
    




    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public float precioMaximo() {
        return 0;
    }
    
}
