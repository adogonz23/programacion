package ies.puerto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class alumnoTest {
    static Alumno alumno;

    
    
    @Test
    public void gettersOK(){
        alumno = new Alumno("Adonay", 28, "A7856");
        alumno.setCurso("programacion");
        String resultado= "programacion";
        String ressultadoOk= alumno.getCurso();
        assertEquals(resultado, ressultadoOk);
        String ressultadoOkStr = "el alumno se llama Adonay, tiene 28 años y cursa :programacion";
        String  resultadoStr = alumno.toString();
        assertEquals(ressultadoOkStr, resultadoStr);
    }
    @Test
    public void autenticacionOk()throws ValidarExcepciones{
        alumno = new Alumno("Adonay", 28, "A7856");
        alumno.setPassword("Albahadmamad");
        String contrseñaIntroducida="Albahadmamad";
        boolean resultado = true;
        boolean resultadoOk= alumno.passOK(alumno.getPassword(),contrseñaIntroducida);
        assertEquals(resultado, resultadoOk);
    }
}

