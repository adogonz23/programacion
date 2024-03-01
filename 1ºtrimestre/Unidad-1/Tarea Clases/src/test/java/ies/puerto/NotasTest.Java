package ies.puerto;

public class NotasTest {
    Notas notas1 = new Notas(5.0);
    

    @Test
    
    public void notasTestOK(){
        String resultado= "aprovado";
        String resultadoOK= calificacion.notas1;
        assertEquals(resultado,resultadoOK);
    }
}