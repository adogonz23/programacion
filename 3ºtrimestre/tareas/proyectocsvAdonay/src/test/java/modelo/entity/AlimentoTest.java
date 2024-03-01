package modelo.entity;
import java.util.Objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.modelo.entity.Alimento;



public class AlimentoTest {
    public final String DELIMITADOR=",";
    private String id= "id";
    private String nombre= "nombre";
    private float precio = 1;
    private String fCaducidad = "01/02/2024";
    private String fEntrda= "01/01/2024";
    Alimento alimento;
    Alimento alimento2;
    @BeforeEach
    public void beforeEach(){
        alimento = new Alimento(id, nombre, precio, fCaducidad, fEntrda);
        alimento2 = new Alimento(id, nombre, precio, fCaducidad, fEntrda);
    }   
    @Test
    public void alimentoNotNullTest(){
        Assertions.assertNotNull(alimento,"la variable no puede ser nula");
    }
    @Test
    public void diasCaducidadTest(){
        int resultado = 0;
        Assertions.assertEquals(alimento.diasCaducidad(), resultado);
    }
    @Test 
    public void esCaducadoTest(){
        Assertions.assertTrue(alimento.esCaducado(), "se esperaba un true");
    }
    @Test
    public void precioMaximoTest(){
        float resultado = 1* 1.35f;
        Assertions.assertEquals(alimento.precioMaximo(), resultado,"el resultado esperado no es el correcto");
    }
    @Test
    public void gettersOK(){
        Assertions.assertEquals(id, alimento.getId(),"El valor esperodo no es le correcto");
        Assertions.assertEquals(nombre, alimento.getNombre(),"El valor esperodo no es le correcto");
        Assertions.assertEquals(precio, alimento.getPrecio(),"El valor esperodo no es le correcto");
        Assertions.assertEquals(fCaducidad, alimento.getfCaducidad(),"El valor esperodo no es le correcto");
        Assertions.assertEquals(fEntrda, alimento.getfEntrada(),"El valor esperodo no es le correcto");
    }
    @Test 
    public void equalsTest (){
        Assertions.assertEquals(alimento, alimento2);;
    }
    @Test 
    public void toStringTest(){
        String resultado="Articulo" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fCaducidad='" + fCaducidad + '\'' +
                ", fEntrada='" + fEntrda + '\'';
        Assertions.assertEquals(alimento.toString(), resultado, "resultado no esperado");
    }
    @Test
    public void toCSVTest(){
        String resultado=nombre+ DELIMITADOR +precio+DELIMITADOR+fEntrda+DELIMITADOR+id+DELIMITADOR+fCaducidad;
        Assertions.assertEquals(alimento.toCsv(), resultado,"resultado no esperado");
    }
    @Test
    public void hascodeTest(){
        Assertions.assertEquals(Objects.hash(id),alimento.hashCode());
    }
    @Test
    public void cantidadMaximaTest(){
        int resultado =0;
        Assertions.assertEquals(alimento.cantidadMaxima(), resultado,"Resultado no esperado, debe ser igual");
    }
}

