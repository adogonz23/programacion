import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.entity.CuidadoPersonal;
import ies.puerto.modelo.entity.Souvenir;

public class SouvenirTest {
    public final String DELIMITADOR = ",";
    private String id= "id";
    private String nombre= "nombre";
    private float precio = 1;
    private int popularidad = 7;
    private int popularidad2 = 5;
    private String fEntrda= "01/01/2024";
    Souvenir souvenir;
    CuidadoPersonal cuidadoPersonal;
    CuidadoPersonal cuidadoPersonal2;
    
    @BeforeEach
    public void BeforeEach(){ 
        souvenir = new Souvenir(id, nombre, precio, fEntrda);
        cuidadoPersonal = new CuidadoPersonal(id, nombre, precio, fEntrda, popularidad);
        cuidadoPersonal2 = new CuidadoPersonal(id, nombre, precio, fEntrda, popularidad2);
    }
    @Test
    public void souvenirNotNull(){
        Assertions.assertNotNull(souvenir,"el objeto no puede ser nulo");
        Assertions.assertNotNull(cuidadoPersonal,"el objeto no puede ser nulo");
        
    }
    @Test
    public void precioMaximoSouvenirTest(){
        float resultado = precio* 1.3f;
        Assertions.assertEquals(souvenir.precioMaximo(), resultado);
    }
    @Test
    public void toStringSouvenirTest(){
        String resultado ="Articulo{" +
        "id='" + id + '\'' +
        ", nombre='" + nombre + '\'' +
        ", precio=" + precio +
        ", fEntrada='" + fEntrda + '\'' +
        '}';
        Assertions.assertEquals(souvenir.toString(), resultado);
    }
    @Test 
    public void toCSVSouvenirTest(){
        String resultado = nombre+ DELIMITADOR +precio+DELIMITADOR+fEntrda+DELIMITADOR+id;
        Assertions.assertEquals(souvenir.toCsv(), resultado);
    }
    @Test
    public void toStringCuidadosTest(){
        String resultado= "Articulo{" +
        "id='" + id + '\'' +
        ", nombre='" + nombre + '\'' +
        ", precio=" + precio +
        ", fEntrada='" + fEntrda + '\'' +
        ", popularidad='" + popularidad + '\'' +
        '}';
        Assertions.assertEquals(cuidadoPersonal.toString(),resultado,"resultado no esperado");
    }
    @Test
    public void toCSVCuidadosTest(){
        String resultado = nombre+ DELIMITADOR +precio
        +DELIMITADOR+fEntrda+DELIMITADOR+
        id+DELIMITADOR+popularidad;
        Assertions.assertEquals(cuidadoPersonal.toCsv(), resultado);
    }
    @Test
    public void precioMaximoTest(){
        float resultado= precio * 1.8f;
        Assertions.assertEquals(cuidadoPersonal.precioMaximo(), resultado,"el resulktado no es le esperado");
    }
    @Test
    public void calcPopularidadTest(){
        int resultado= popularidad;
        Assertions.assertEquals(cuidadoPersonal.calcPopularidad(),resultado);
    }
    @Test 
    public void recomendableTest(){
        Assertions.assertFalse(cuidadoPersonal2.recomendable());
        Assertions.assertTrue(cuidadoPersonal.recomendable());
        
    }
}
