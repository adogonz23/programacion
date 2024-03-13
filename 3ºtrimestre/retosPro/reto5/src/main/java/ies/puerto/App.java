package ies.puerto;


public class App {
    public static void main( String[] args ){
        System.out.println(invertirTexto("hola holita"));
    }
    public static char[] invertirTexto(String palabra){
        char[] palabraString = new char[palabra.length()];
        for(int i=0;i<palabra.length();i++){
            palabraString[i]=palabra.charAt(i);
        }
        char[]palaInvertida= new char[palabra.length()];
            int i=0;
            for(int j=palabra.length()-1;j>= 0;j--){
            palaInvertida[i]= palabraString[j];
            i++;
        }
        return palaInvertida;
    }
}