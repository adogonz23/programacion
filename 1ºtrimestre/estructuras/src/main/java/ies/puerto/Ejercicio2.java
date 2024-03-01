package ies.puerto;
/** Escribe un programa que encuentre el primer número primo mayor que 100 , utilizando break.
 * @author adogonz23
 */

public class Ejercicio2 {
    /**
     *  metodo que nos comprueba si un valor es prime 
     * @param valor a comprobar
     * @return 
     */
    public static boolean esPrimo( int valor){
        for(int i =2;i<valor;i++){
            if (valor%i==0) {
                return false;
            }
        }
        return true;
    } 
    /**
     * metodo que nos busca el primer numero primo apartir de 100 y lo imprime
     * @param args
     */
    public static void main(String[] args) {
        for(int i =100;i<=20000;i++){
            if (esPrimo(i)) {
                System.out.println(i);
                break;
            }
        }
    }     
}
