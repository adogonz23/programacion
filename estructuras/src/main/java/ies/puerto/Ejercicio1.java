package ies.puerto;
/**
 * Escribe un programa que encuentre el primer número divisible por 7 y 5 entre 1 y 100 (inclusive), utilizando break.
 * @author adogonz23
 */

public class Ejercicio1 {
    
    public int encuentraValor(){
        int valor=0;
        for (int i =1;i<=100;i++){
            
            if (i/5==0 && i/7 ==0) {
                valor=i;
                break;
            }
            
        }
        return valor;
    }
}
