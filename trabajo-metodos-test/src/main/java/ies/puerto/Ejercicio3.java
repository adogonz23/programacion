package ies.puerto;
/**
 *  Implementa un programa que calcule y muestre la suma de los dígitos de un número entero. Puntuación 1 punto. Con test que verifique el comportamiento 1,25).
 * @author adogonz23
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Integer valorIngresado=12345;
        int[]digitos=digitosEntero(valorIngresado);
        int suma=sumaDigitos(digitos);
        System.out.println("la suma de los digios del numero "+valorIngresado+" es="+suma);
    }
    /**
     * metodo que descompone un numero en digitos y los mete dentro de un array 
     * @param valor introducido por el usuario
     * @return devuelve  el array con los digitos del numero introducido
     */
    public static int[] digitosEntero(Integer valor){
        String valorStr= Integer.toString(valor);
        char[]digitosChar = new char[valorStr.length()];
        int[] digitos= new int[valorStr.length()];
        for(int i=0;i<digitosChar.length;i++){
            digitosChar[i]=valorStr.charAt(i);
            digitos[i]= Character.getNumericValue(digitosChar[i]);
        }       
        return digitos;
        }
        public static int sumaDigitos(int[]digitos){
            int suma=0;
            for(int i=0;i<digitos.length;i++){
            suma= suma+digitos[i];
            }
            return suma;
        }
}
