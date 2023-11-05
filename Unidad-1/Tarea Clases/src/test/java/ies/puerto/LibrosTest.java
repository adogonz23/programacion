package ies.puerto;
/**
 * @author adogonz23
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LibrosTest {
    Libros libro1= new Libros("Pedro Picapiedra","Albahadmamad", 2222);

    @Test
    public void imprimirOk(){
        String resultado= "Titulo: Pedro Picapiedra Autor: Albahadmamad Año de publicación :2222";
        String resultaOK= libro1.imprimir();
        assertEquals(resultado, resultaOK);
    
    }
    @Test 
    public void cambiarAutorOk(){
        libro1.cambiarAutor("Adonay Gonzalez");
        String resultado= "Titulo: Pedro Picapiedra Autor: Adonay Gonzalez Año de publicación :2222";
        String resultaOK= libro1.imprimir();
        assertEquals(resultado, resultaOK);

    }
    @Test 
    public void cambiarTituloOk(){
        libro1.setTitulo("HAH");
        String resultado= "Titulo: HAH Autor: Albahadmamad Año de publicación :2222";
        String resultaOK= libro1.imprimir();
        assertEquals(resultado, resultaOK);

    }
}