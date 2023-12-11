package ies.puerto;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author adogonz23
 * 
 * implementa un método en la clase CorreoElectronico llamado validar que lance una excepción personalizada (CorreoInvalidoException) si la dirección de correo no cumple con los siguientes criterios:
Debe contener exactamente un símbolo "@".
El símbolo "@" no puede estar al principio ni al final de la dirección.
Debe haber al menos un carácter antes y después del símbolo "@".
Después del símbolo "@" debe haber al menos un punto ".".
Después del último punto "." debe haber al menos dos caracteres.
 */
public class CorreoElectronico {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca su correo electronico por favor");
        String correoElectronico = lector.nextLine();
        if (correoOK(correoElectronico)) {
            System.out.println("El correo es valido");
        }else{
            throw new Exception("El correo no es valido");
        }
        lector.close();

    }
    public static boolean correoOK(String correo){
        String regex ="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,3}$";
        if (Pattern.matches(regex,correo)) {
            return true;
        }
        return false;
    }

}
