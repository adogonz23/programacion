package es.ies.puerto.negocio;

import es.ies.puerto.modelo.abstractas.ProductoAbstract;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.negocio.interfaces.ITienda;

import java.util.ArrayList;

import java.util.List;

public class Tienda  implements ITienda{

    ICrudOperaciones persistencia;

    List<ProductoAbstract> alimentos;

    public Tienda() {
        alimentos = new ArrayList<>();
    }

    public boolean existeProducto(ProductoAbstract productoAbstract){
        return alimentos.contains(productoAbstract);
    }
    @Override
    public boolean crearProducto(ProductoAbstract productoAbstract) {
        if (!existeProducto(productoAbstract)) {
            return alimentos.add(productoAbstract);
        }
        return true;
    }

    @Override
    public boolean eliminarProducto(ProductoAbstract producto) {
    return alimentos.remove(producto);
    }

    @Override
    public List<ProductoAbstract> obtenerProductos() {
        return alimentos;
    }
    @Override
    public ProductoAbstract obtenerProducto(ProductoAbstract productoAbstract) {
        if (existeProducto(productoAbstract)) {
            int posicion =alimentos.indexOf(productoAbstract);
            return alimentos.get(posicion);
        }
        return null;
    }

    @Override
    public boolean actualizarProducto(ProductoAbstract productoAbstract) {
        if (existeProducto(productoAbstract)) {
            int posicion =alimentos.indexOf(productoAbstract);
            alimentos.set(posicion, productoAbstract);
            return true;
        }
        return true;
    }
    
}
