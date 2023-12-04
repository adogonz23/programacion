package ies.puerto;
/**
 * numeros primos
 */
public class Ejercicio3 {
    public static boolean esPrimo(Integer valor){
        for(int i=2;i<valor;i++){
            if (valor%i==0) {
                return false;
            }
        }
        return true;
    }
}
