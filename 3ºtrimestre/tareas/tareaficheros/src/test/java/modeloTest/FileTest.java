package modeloTest;

import java.lang.annotation.Target;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.file.implementacion.csv.FileCsv;

public class FileTest {
    int id=18;
    String nombre="nombre";
    String tipo= "tipo";
    int calorias=200;
    float proteinas= 20f;
    float grasas= 0.3f;
    float carbohidratos =0.5f;
    FileCsv fileCsv;
    List<Alimento> alimentos;
    Alimento alimento;
    
    @BeforeEach
    public void beforeEach(){
        fileCsv= new FileCsv();
        alimentos = fileCsv.obtenerAlimentos();
        alimento = new Alimento(id, nombre, tipo, calorias, proteinas, grasas, carbohidratos);
    }
    @Test
    public void notNullTEst(){
        Assertions.assertNotNull(alimentos,"no puede ser nulo");
    }
    @Test
    public void insrtarEntradaTEST(){
        fileCsv.escribir(fileCsv.RUTA_FICHERO, alimento.toCsv());
        alimentos= fileCsv.obtenerAlimentos();
        Assertions.assertTrue(alimentos.contains(alimento));
    }
    @Test 
    public void eliminarEntradaTest(){
        fileCsv.eliminar(fileCsv.RUTA_FICHERO, alimento.getId());
        alimentos = fileCsv.obtenerAlimentos();
        Assertions.assertFalse(alimentos.contains(alimento));
    }
    @Test
    public void ActualizarOk(){
        alimento= new Alimento(1, nombre, tipo, calorias, proteinas, grasas, carbohidratos);
        Assertions.assertTrue(fileCsv.actualizar(fileCsv.RUTA_FICHERO, alimento));
        alimento = new Alimento(28);
        Assertions.assertFalse(fileCsv.actualizar(fileCsv.RUTA_FICHERO, alimento));;
    }
}
