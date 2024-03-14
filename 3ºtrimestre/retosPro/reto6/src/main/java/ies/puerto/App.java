package ies.puerto;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main( String[] args ){
        
        String fechaHoraString = "03-12-2012"; // Ejemplo de String de fecha y hora
        
        // Define el formato del String
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parsea el String a LocalDateTime
        LocalDate fechaHora = LocalDate.parse(fechaHoraString, formateador);

        // Imprime el LocalDateTime
        System.out.println("Fecha y hora parseadas: " + fechaHora);
    }
    
}
