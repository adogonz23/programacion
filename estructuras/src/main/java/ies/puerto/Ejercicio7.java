package ies.puerto;
/**
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
