package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TiendaTest {
    Producto producto1 = new Producto("aguacate", 14.5, 250);
    Producto producto2 = new Producto("papakineua", 5.5, 100);
    Tienda casaConchaTienda = new Tienda();
    @Test
    public void agregarProducto(){

    }
    @Test
    public void venderProductosOk(){
        casaConchaTienda.agregarProducto(producto1);
        casaConchaTienda.agregarProducto(producto2);
        casaConchaTienda.venderProductos("papakineua", 5);
        casaConchaTienda.venderProductos("aguacate", 2);
        int resultado1=95;
        int resultado2=248;
        int resultado1OK= producto2.getStock();
        int resultado2OK= producto1.getStock();
        assertEquals(resultado1, resultado1OK);
        assertEquals(resultado2, resultado2OK);
    }
    @Test 
    public void todoOk(){
        casaConchaTienda.agregarProducto(producto1);
        casaConchaTienda.agregarProducto(producto2);
        casaConchaTienda.venderProductos("papakineua", 5);
        casaConchaTienda.venderProductos("aguacate", 2);
        String resultado= "Nombre: agucate, precio: 14.5, stock: 248 Nombre: papakineua, precio: 5.5, stock: 98";
        String resultadoOk = casaConchaTienda.mostrarInventario();
        assertEquals(resultado, resultadoOk);
    }

}
