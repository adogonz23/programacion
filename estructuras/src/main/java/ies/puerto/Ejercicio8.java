package ies.puerto;
/** Escribe un programa que sume todos los números pares del 1 al 10, usando continue para omitir los números impares
 * @author adogonz23
 */
public class Ejercicio8 {
    
    public static void main(String[] args) {
        int suma=0;
        for(int i=2;i<=10;i++){
            if (i%2!=0) {
                continue;
            }
            suma=suma+i;
        }
        System.out.println(suma);
    }
    
}
