package ies.puerto;
/**
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
