package ies.puerto;
/**
 * @author adogonz23   
 * Desarrolla un programa que convierta un número entero a su representación binaria utilizando métodos de la clase Integer. Puntuación 1 punto. Con test que verifique el comportamiento 1,25)
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        int numero=-5;
        System.out.println(invertirString(enteroABinario(numero)));
    }
    /**
     * metodo que nos devuelve un numero entero en binario a falta de invertirlo, Este metodo no es el correcto pero fue mio primera idea, hasta qeu rebuscado en la clse integer
     * tiene su propio metodo.
     * @param numero
     * @return
     */
    public static  String enteroABinario(int numero){
        String numeroBinaro="";
        
        while(numero!=0){
            int cociente=numero/2;
            int resto=numero%2;
            numero=cociente;
            String restostr=Integer.toString(resto);
            numeroBinaro=numeroBinaro+restostr.charAt(0);

        }
        return numeroBinaro;
    }
    /**
     * metodo qeu no invierte un string, en este caso lo usamos para leer de abajo para arriba el resultado del metodo anterior
     * @param frase
     * @return
     */
    public static String invertirString (String frase){

        String fraseInv= "";
    for(int i= frase.length()-1;i >= 0;--i){
        fraseInv=fraseInv+frase.charAt(i);   
    }
        return fraseInv;
    }

}
