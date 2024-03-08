package negocioTest;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.entity.Alimento;
import ies.puerto.negocio.implementacion.TiendaNegocio;

public class TiendaTest {
    int id = 25;
    int id2 = 35;
    String nombre="nombre";
    String tipo= "tipo";
    int calorias=200;
    float proteinas= 20f;
    float grasas= 0.3f;
    float carbohidratos =0.5f;
    TiendaNegocio tiendaNegocio;
    List<Alimento> alimentos;
    Alimento alimento;
    Alimento alimento2;

    @BeforeEach
    public void beforeEach(){
        tiendaNegocio =new TiendaNegocio();

        alimentos = tiendaNegocio.obtenerAlimentos();
        alimento = new Alimento(id, nombre, tipo, calorias, proteinas, grasas, carbohidratos);
        tiendaNegocio.escribir(tiendaNegocio.RUTA_FICHERO,alimento.toCsv());
        
        

    }
    @Test
    public void notNullTest(){
        Assertions.assertNotNull(alimentos);
    }

    @Test
    public  void mostrarAlimentoTest(){
        Assertions.assertEquals(tiendaNegocio.mostrarAlimento(25), alimento);
    }
    @Test
    public void actualizarAlimentoTest(){
        float carbohidratos2 = 12.f;
        alimento= new Alimento(id, nombre, tipo, calorias, proteinas, grasas, carbohidratos2);
        tiendaNegocio.actualizarAlimento(alimento);
        Assertions.assertEquals(tiendaNegocio.mostrarAlimento(id).getCarbohidratos(), carbohidratos2);
    }
    @Test
    public void eliminarAlimentoTest(){
        alimento2=new Alimento(id2);
        tiendaNegocio.escribir(tiendaNegocio.RUTA_FICHERO, alimento2.toCsv());
        alimentos= tiendaNegocio.obtenerListaAlimentos();
        Assertions.assertTrue(tiendaNegocio.eliminarAlimento(25,alimentos));
    }

}
