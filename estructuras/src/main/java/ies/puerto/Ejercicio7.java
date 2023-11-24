package ies.puerto;
/** Escribe un programa que imprima todos los números impares del 1 al 20, usando continue para omitir los números pares.
 * @author adogonz23
 */
public class Ejercicio7 {

    public void printPares(){
        for(int i=2;i<=20;i++){
            if (i%2!=0) {
                continue;
            }
            System.out.println(i);
        }
    }    
}
