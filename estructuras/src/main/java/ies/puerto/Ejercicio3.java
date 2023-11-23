package ies.puerto;
/**Escribe un programa que busque el número 7 en un array, utilizando break.
 * @author adogonz23
 */
public class Ejercicio3 {

    public void busquedaBinaria(int[]array){
        for(int i=0;i<array.length;i++){
            if (array[i]==7) {
                System.out.println("Encontrdo en la posicion "+array[i]);
                break;
            }
        }
    }
    
}
