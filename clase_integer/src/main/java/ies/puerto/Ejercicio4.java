package ies.puerto;
/**
 * implementa un programa que calcule y muestre la suma de los digitos de un numero.
 */
public class Ejercicio4 {
    public static int[] digitosEntero(Integer valor){
    String valorStr= Integer.toString(valor);
    char[]digitosChar = new char[valorStr.length()];
    int[] digito= new int[valorStr.length()];
    for(int i=0;i<digitosChar.length;i++){
        digitosChar[i]=valorStr.charAt(i);
        digito[i]= Character.getNumericValue(digitosChar[i]);
    }       
    return digito;
    }
    public static void main(String[] args) {
        Integer valor=12345;
        int[]digitos=digitosEntero(valor);
        int suma=0;
        for(int i=0;i<digitos.length;i++){
            suma= suma+digitos[i];
            System.out.println(digitos[i]);
        }
        System.out.println(suma);
    }
}
