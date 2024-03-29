package ies.puerto.modelo.entity;

import ies.puerto.modelo.abstractas.Articulo;

public class Aparato extends Articulo{
    public Aparato(String id, String nombre, float precio, String fEntrada) {
        super(id, nombre, precio, null, fEntrada);
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "id='" + this.getId() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", fEntrada='" + getfEntrada() + '\'' +
                '}';
    }

    @Override
    public String toCsv(){
        return getNombre()+ DELIMITADOR +getPrecio()+DELIMITADOR+getfEntrada()+DELIMITADOR+getId();
    }

    @Override
    public float precioMaximo() {
        return 1.42f;
    }

}
