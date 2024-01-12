package ies.puerto;
/**
 * Crea un paquete acceso con una clase Autenticacion que contenga métodos para validar credenciales de usuarios. 
 * Utiliza esta clase en el paquete modelo para añadir funcionalidades de autenticación a las clases Persona y Estudiante.
 */
public class Autenticacion {

    
    
    public boolean passOK ( String textoIntroducido,String pasword) throws ValidarExcepciones{

        if (textoIntroducido !=pasword) {
            throw new ValidarExcepciones("La contraseña es incorrecta");
            
        
        }
        return true;
    }
}
