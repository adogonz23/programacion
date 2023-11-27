package ies.puerto;
/**
 * @author adogonz23
 */


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ejercicio5 {
   
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("introduzca la fecha de su nacimiento");
        String fechaCumpleString=scaner.nextLine();
       
        
       
    }
    public Date FechaOK(String fecha){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fecha= formatoFecha.parse(fecha);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return fecha;
    }
}

