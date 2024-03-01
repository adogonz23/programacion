package ies.puerto;

import java.text.SimpleDateFormat;
import java.util.Date;




public class Ejercicio8 {
    public static void main(String[] args) {

        String fechaSinFormato = "03-12-1995";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date fechaFormato = formato.parse(fechaSinFormato);
        } catch (Exception e) {
            // 
        }
        
        System.out.println(fechaSinFormato);
    }
}
