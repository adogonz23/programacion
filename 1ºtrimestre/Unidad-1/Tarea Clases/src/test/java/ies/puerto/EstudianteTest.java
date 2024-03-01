package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EstudianteTest {
    int[]notas={5,5,5,5,5};
    int[]notas1={5,6,7,8,9};
    Estudiante estudiante = new Estudiante("von neuman", 55, "informatico", notas);
    Estudiante estudiante1 = new Estudiante("Adonay", 22, "informatica",notas);
    @Test
    public void notasOk(){
        estudiante1.setNotas(notas1);
        int[] resultado= {5,6,7,8,9};
        int[] resultadoOk=estudiante1.getNotas();
        assertArrayEquals(resultado, resultadoOk);
    }
    @Test
    public void promedioNotasOk(){
        estudiante1.promedioNotas(notas1);
        double resultado=7.0;
        double resultadoOk= estudiante1.getPromedio();
        assertEquals(resultado, resultadoOk);
    }
    @Test 
    public void todoOk(){
        estudiante1.setNotas(notas1);
        estudiante1.promedioNotas(notas1);
        String resultado= "El alumno Adonay con edad 22años, cursando la carrera de informatica, con una media de 7.0 esta aprovado";
        String resultadoOK= estudiante1.printInfo();
        assertEquals(resultado, resultadoOK);
    }
}