package ies.puerto.Ejercicios;

import java.util.ArrayList;
import java.util.List;

/**
 *Crea un programa que declare e inicialice un ArrayList de enteros. Luego, agrega números pares del 1 al 10 a la lista.
Crea un programa que demuestre el comportamiento correcto del programa App+NombreIdentificativo, o test unitarios que sistituyen a este.
 *
 */
public class Ejercicio1 {
    static List<Integer>listaNumeroPares;
    static List<Integer>listaNumeroImpares;
    
    
    public static void main(String[] args) {
        listaNumeroPares= new ArrayList<>();
        listaNumeroImpares= new ArrayList<>();
        for(int i=1;i<10;i++){
            if (esNumeroPar(i)) {
            listaNumeroPares.add(i);
            }
            listaNumeroImpares.add(i);
        }
    }
    /**
     * funciomn que verifica si un numero es par
     * @param i numero a verificar
     * @return true/false si es par o no;
     */
    private static boolean esNumeroPar(int i){
        if (i%2==0) {
            return true;
        }
        return false;
    }
}
