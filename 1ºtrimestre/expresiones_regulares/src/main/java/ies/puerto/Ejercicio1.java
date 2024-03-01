package ies.puerto;

import java.util.Scanner;
import java.util.regex.*;

/**
 * @author adogonz23
 * Crea un programa que valide si una cadena es una dirección de correo electrónico válida utilizando expresiones regulares.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String regex= "^([a-zA-Z]\\d)+@([a-zA-Z]\\d+)+\\.([a-zA-Z]({2}{3}))$";
        Pattern patron = Pattern.compile(regex);
        Scanner escaner=new Scanner(System.in);
        System.out.println("Introduce el email");
        String email= escaner.next();
        Matcher matcher= patron.matcher(email);
        boolean coincide = matcher.matches();
        System.out.println(coincide);
    }
}