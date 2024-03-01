package ies.puerto.negocio.abstrabtas;

import ies.puerto.modelo.interfaces.IRecomendable;

public class ProductoRecomendable extends Producto implements IRecomendable{

    @Override
    public boolean recomendarProducto() {
    return false;
    }

    @Override
    public int calcularPopularidad() {
        return 0;
    }
}
