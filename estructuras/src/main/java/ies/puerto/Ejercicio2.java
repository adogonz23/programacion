package ies.puerto;
/** Escribe un programa que encuentre el primer número primo mayor que 100 , utilizando break.
 * @author adogonz23
 */

public class Ejercicio2 {
    
    public static boolean esPrimo( int valor){
        for(int i =2;i<valor;i++){
            if (valor%i==0) {
                return false;
            }
        }
        return true;
    } 
    public static void main(String[] args) {
        for(int i =100;i<=20000;i++){
            if (esPrimo(i)==true) {
                System.out.println(i);
                break;
            }
        }
    }     
}
