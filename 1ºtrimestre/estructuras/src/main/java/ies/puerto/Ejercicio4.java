package ies.puerto;

/**Escribe un programa que encuentre el primer número negativo en un array, utilizando break.
 * @author adogonz23
 */
public class Ejercicio4 {
    public void busquedaBinaria(int[] array){
        for(int i=0;i<array.length;i++){
            if (array[i]<0) {
                System.out.println("Encontrado el primer negativo en la posicion" +array[i]);
                break;
            }
        }
    }
    
}
