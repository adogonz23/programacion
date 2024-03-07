package modeloTest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.entity.Alimento;
public class ArticuloTest {
    
    int id=18;
    String nombre="nombre";
    String tipo= "tipo";
    int calorias=200;
    float proteinas= 20f;
    float grasas= 0.3f;
    float carbohidratos =0.5f;
    final String DELIMITADOR=",";
    Alimento alimento;
    Alimento alimento2;

    @BeforeEach
    public void beforeEach(){
        alimento = new Alimento(id, nombre, tipo, calorias, proteinas, grasas, carbohidratos);
    }
    @Test
    public void notNulTest(){
        Assertions.assertNotNull(alimento);
        
    }   
    @Test
    public void getSetTEst(){
    String nombre2="OtroNombre";
    String tipo2= "Otrotipo";
    int calorias2=20;
    float proteinas2= 28f;
    float grasas2= 0.4f;
    float carbohidratos2 =0.6f;
    alimento.setCalorias(calorias2);
    alimento.setCarbohidratos(carbohidratos2);
    alimento.setGrasas(grasas2);
    alimento.setNombre(nombre2);
    alimento.setTipo(tipo2);
    alimento.setProteinas(proteinas2);
    Assertions.assertEquals(alimento.getNombre(), nombre2,"resultado no esperado");
    Assertions.assertEquals(alimento.getTipo(), tipo2,"resultado no esperado");
    Assertions.assertEquals(alimento.getCalorias(), calorias2,"resultado no esperado");
    Assertions.assertEquals(alimento.getProteinas(), proteinas2,"resultado no esperado");
    Assertions.assertEquals(alimento.getGrasas(), grasas2,"resultado no esperado");
    Assertions.assertEquals(alimento.getCarbohidratos(), carbohidratos2,"resultado no esperado");
    Assertions.assertEquals(alimento.getId(), id);
    }
    @Test
    public void tStringTest(){
        Assertions.assertTrue(alimento.toString().contains(nombre));
        Assertions.assertTrue(alimento.toString().contains(String.valueOf(id)));
        Assertions.assertTrue(alimento.toString().contains(tipo));
        Assertions.assertTrue(alimento.toString().contains(String.valueOf(calorias)));
        Assertions.assertTrue(alimento.toString().contains(String.valueOf(proteinas)));
        Assertions.assertTrue(alimento.toString().contains(String.valueOf(grasas)));
        Assertions.assertTrue(alimento.toString().contains(String.valueOf(carbohidratos)));
    }
    @Test
    public void toCsvTest(){
        Assertions.assertTrue(alimento.toCsv().contains(nombre));
        Assertions.assertTrue(alimento.toCsv().contains(String.valueOf(id)));
        Assertions.assertTrue(alimento.toCsv().contains(tipo));
        Assertions.assertTrue(alimento.toCsv().contains(String.valueOf(calorias)));
        Assertions.assertTrue(alimento.toCsv().contains(String.valueOf(proteinas)));
        Assertions.assertTrue(alimento.toCsv().contains(String.valueOf(grasas)));
        Assertions.assertTrue(alimento.toCsv().contains(String.valueOf(carbohidratos)));
        Assertions.assertTrue(alimento.toCsv().contains(DELIMITADOR));
    }
    @Test
    public void equalTest(){
        alimento2 = new Alimento(20);
        Assertions.assertFalse(alimento.equals(alimento2));
    }
    @Test
    public void equalTest2(){
        alimento2 = new Alimento(id);
        Assertions.assertTrue(alimento.equals(alimento2));
    }
    @Test
    public void hascodeTest(){
        alimento2 = new Alimento(id);
        Assertions.assertEquals(alimento.hashCode(), alimento2.hashCode());
    }
}
