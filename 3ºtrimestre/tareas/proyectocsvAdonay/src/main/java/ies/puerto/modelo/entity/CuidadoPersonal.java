package ies.puerto.modelo.entity;


import ies.puerto.modelo.abstractas.ArticuloRecomendable;

public class CuidadoPersonal extends ArticuloRecomendable{
    private int popularidad;
    public CuidadoPersonal(String id, String nombre, float precio, String fEntrada, int popularidad) {
        super(id, nombre, precio, fEntrada);
        this.popularidad = popularidad;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "id='" + this.getId() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", fEntrada='" + getfEntrada() + '\'' +
                ", popularidad='" + popularidad + '\'' +
                '}';
    }

    @Override
    public String toCsv(){
        return getNombre()+ DELIMITADOR +getPrecio()
                +DELIMITADOR+getfEntrada()+DELIMITADOR+
                getId()+DELIMITADOR+popularidad;
    }

    @Override
    public float precioMaximo() {
        return  1.8f;
        }


    @Override
    public boolean recomendable() {
        if (popularidad >= 7) {
            return true;
        }
        return false;
    }

    @Override
    public int calcPopularidad() {
        return popularidad;
    }
}
