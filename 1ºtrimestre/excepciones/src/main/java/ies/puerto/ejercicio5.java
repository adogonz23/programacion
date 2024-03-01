package ies.puerto;
/**
 * @author adogonz23
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("introduzca la fecha de su nacimiento");
        String fechaCumpleSrt=scaner.nextLine();
        System.out.println("adonay nacio en:"+fechaOK(fechaCumpleSrt));
    }
    public static Date fechaOK(String fecha){
        Date fechaa=null;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fechaa=formatoFecha.parse(fecha);
        } catch (ParseException exception) {
            System.out.println("formato erroneo");
    }return fechaa;
}
}

