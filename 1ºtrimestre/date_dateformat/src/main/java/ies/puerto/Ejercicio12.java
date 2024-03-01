package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;;
public class Ejercicio12 {
    public static void main(String[] args) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaCumpleaños= formato.parse("03/12/1995");
            System.out.println("edadque tengo"+fechaCumpleaños);
        } catch (ParseException parseException) {
            System.out.println("Error de formato");
        }
    }
}
