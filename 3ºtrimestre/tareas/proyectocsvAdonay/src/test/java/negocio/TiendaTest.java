package negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.abstractas.Articulo;
import ies.puerto.modelo.entity.Alimento;
import ies.puerto.negocio.abstractas.TiendaNegocio;

public class TiendaTest {
    TiendaNegocio tiendaNegocio;
    Alimento alimento;
    public final String DELIMITADOR=",";
    private String id= "id";
    private String nombre= "nombre";
    private float precio = 1;
    private String fCaducidad = "01/02/2024";
    private String fEntrda= "01/01/2024";
    private String nombreActu ="nombreAct";
    private float precioAct = 1;
    private String fCaducidadAct = "02/02/2024";
    private String fEntrdaAct= "02/01/2024";
    
    @BeforeEach
    public void beforeEach(){
        tiendaNegocio = new TiendaNegocio();
        alimento = new Alimento(id, nombre, precio, fCaducidad, fEntrda);
        tiendaNegocio.crearProducto(alimento);
    }
    @Test
    public void tiendaNotNull(){
        Assertions.assertNotNull(tiendaNegocio,"no puede ser nulo");
    }
    @Test
    public void addAlimentoTiendaTest(){
        Assertions.assertEquals(13, tiendaNegocio.obtenerArticulos().size());
    }
    @Test
    public void eliminarProductoTest(){
        tiendaNegocio.eliminarProducto(alimento);
        Assertions.assertEquals(4, tiendaNegocio.obtenerAlimentos().size());
    }
    @Test
    public void actualizarProductoTEst(){
        Alimento alimentoActualizar= new Alimento(id, nombreActu, precioAct, fCaducidadAct, fEntrdaAct);
        tiendaNegocio.actualizarProducto(alimentoActualizar);
        Alimento alimentoBuscar = new Alimento(id, nombre, precio, fCaducidad, fEntrda);
        alimentoBuscar = (Alimento) tiendaNegocio.obtenerProducto(alimentoBuscar);
        assertEquals(nombreActu, alimentoActualizar.getNombre());
        assertEquals(precioAct, alimentoActualizar.getPrecio());
        
    }

}
