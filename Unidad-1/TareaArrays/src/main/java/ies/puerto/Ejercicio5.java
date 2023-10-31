package ies.puerto;
/**
 * dado un valor especifico, encuentra su posicion en el array o indica si no esta presente
 * @author adogonz23
 */
public class Ejercicio5 {
   
/**
 * 
 * @param array array con los numeros a comparar
 * @param valorDado valor entregado para chequear
 * @return devuelve la posicion en la qeu se encuentra el valor
 */     
        public int valorEspecifico(int[]array, int valorDado){
            
            for(int i=0;i<array.length;i++){
                if (array[i]==valorDado) {
                    return i;
                    
                }
                
            }
        return -1; //porque es una posicion que no existe.
        }
    }
    
