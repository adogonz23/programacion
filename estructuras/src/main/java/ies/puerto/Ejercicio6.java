package ies.puerto;
/** Escribe un programa que imprima los números del 1 al 20, pero omita la impresión de los números que son múltiplos de 3 utilizando continue.
 * @author adogonz23
 */

public class Ejercicio6 {
    
    public void multiplosTres(){
        for(int i= 1;i<=20;i++){
            if (i%3==0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
