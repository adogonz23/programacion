package modelo.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.entity.Aparato;

public class AparatoTest {
    public final String DELIMITADOR = ",";
    private String id= "id";
    private String nombre= "nombre";
    private float precio = 1;
    private String fEntrda= "01/01/2024";
    Aparato aparato;
    @BeforeEach
    public void beforeEach(){
        aparato =new Aparato(id, nombre, precio, fEntrda);

    }
    @Test
    public void aparatoNotNull(){
        Assertions.assertNotNull(aparato,"el objeto no puede ser nulo");
    }
    @Test
    public void toStringTest(){
        String resultado ="Articulo{" +
        "id='" + id + '\'' +
        ", nombre='" + nombre + '\'' +
        ", precio=" + precio +
        ", fEntrada='" + fEntrda + '\'' +
        '}';
        Assertions.assertEquals(aparato.toString(), resultado);
    }
    @Test
    public void toCSVSouvenirTest(){
        String resultado = nombre+ DELIMITADOR +precio+DELIMITADOR+fEntrda+DELIMITADOR+id;
        Assertions.assertEquals(aparato.toCsv(), resultado);
    }
    @Test 
    public void precioMaximoTest(){
        float resultado = precio*1.42f;
        Assertions.assertEquals(aparato.precioMaximo(),resultado,"resultado no esperado");
    }
}
