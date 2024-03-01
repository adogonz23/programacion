package ies.puerto;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Scanner scaner = new Scanner(System.in);
        String fechaEntrda = "30/01/2024";
        DateTimeFormatter formato =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaformateada= LocalDate.parse(fechaEntrda, formato);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaformateada, ahora);
        if (periodo.getMonths()<1 && periodo.getYears()<1 ) {
            System.out.println("la comida no esta caducada"+periodo.getYears());
        }
        else{
            System.out.println("si lo esta"+periodo.getMonths());
        }
        String regex = "[0-9]{8}[A-Z a-z]";
        Pattern patron = Pattern.compile(regex);
        String dni=null;
        System.out.println("introduzca dni");
        dni=scaner.nextLine();
        Matcher comprobador= patron.matcher(dni);
        if (comprobador.matches()) {
            System.out.println("formato correcto");
        }else{
            System.out.println("try again");
        }
        scaner.close();
        
        
    }

    
    
}
