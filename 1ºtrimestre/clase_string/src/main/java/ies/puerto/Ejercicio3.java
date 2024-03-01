package ies.puerto;
/**
 * Desarrolla un programa que cuente el número de vocales en una cadena de texto
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String cosa="adonay";
        cosa=cosa.toLowerCase();
        char[]vocales ={'a','e','i','o','u'};
        int contador= buscador(cosa, vocales);
        System.out.println(contador);
    }
    public static int buscador(String cosa, char[] vocales){
        int contador=0;
        for(int i=0;i<cosa.length();i++){
            char caracter=cosa.charAt(i);
            for(int j=0;j<vocales.length;j++){
                char vocal= vocales[j];
                if (caracter==vocal) {
                    contador++;
                    i++;
                }
            }
        }
        return contador;
    }

}
